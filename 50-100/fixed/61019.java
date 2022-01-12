public void verify() throws org.silverpeas.authentication.exception.AuthenticationException {
    if ((getUser()) == null) {
        throw new org.silverpeas.authentication.exception.AuthenticationBadCredentialException("UserCanLoginVerifier.verify()", com.stratelia.webactiv.util.exception.SilverpeasException.ERROR, "authentication.EX_VERIFY_USER_CAN_LOGIN");
    }else
        if (!(isUserStateValid())) {
            throw new org.silverpeas.authentication.exception.AuthenticationUserAccountBlockedException("UserCanLoginVerifier.verify()", com.stratelia.webactiv.util.exception.SilverpeasException.ERROR, "authentication.EX_VERIFY_USER_CAN_LOGIN", ("Login=" + (getUser().getLogin())));
        }
    
}