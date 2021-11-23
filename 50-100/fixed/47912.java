public static void verifyUserEmail(java.lang.String email, java.lang.String verificationToken) throws com.pratilipi.common.exception.InvalidArgumentException {
    com.pratilipi.data.DataAccessor dataAccessor = com.pratilipi.data.DataAccessorFactory.getDataAccessor();
    com.pratilipi.data.type.User user = dataAccessor.getUserByEmail(email.toLowerCase());
    if ((user == null) || ((user.getState()) != (com.pratilipi.common.type.UserState.REGISTERED)))
        return ;
    
    if (!(com.pratilipi.data.util.UserDataUtil.verifyToken(user, verificationToken)))
        throw new com.pratilipi.common.exception.InvalidArgumentException(com.pratilipi.api.shared.GenericRequest.ERR_VERIFICATION_TOKEN_INVALID_OR_EXPIRED);
    
    user.setState(UserState.ACTIVE);
    dataAccessor.createOrUpdateUser(user);
}