public org.envirocar.server.core.entities.PasswordReset requestPasswordReset(org.envirocar.server.core.entities.User user) throws org.envirocar.server.core.exception.BadRequestException {
    org.envirocar.server.mongo.entity.MongoPasswordReset status = getPasswordResetStatus(user, null);
    if ((status == null) || (status.isExpired())) {
        org.envirocar.server.mongo.entity.MongoPasswordReset result = createNewPasswordReset(user);
        return result;
    }else {
        throw new org.envirocar.server.core.exception.BadRequestException("The given user already has requested a verification code.");
    }
}