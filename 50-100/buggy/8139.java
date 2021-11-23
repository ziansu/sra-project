@java.lang.Override
public void resetPassword(org.envirocar.server.core.entities.User user, java.lang.String verificationCode) throws org.envirocar.server.core.exception.BadRequestException {
    org.envirocar.server.mongo.entity.MongoPasswordReset status = this.passwordResetDao.getPasswordResetStatus(user);
    if ((status != null) && (!(status.isExpired()))) {
        if (status.getCode().equals(verificationCode)) {
            save(user);
        }else {
            throw new org.envirocar.server.core.exception.BadRequestException("Wrong verification code.");
        }
    }else {
        throw new org.envirocar.server.core.exception.BadRequestException("Verification code already expired.");
    }
    this.passwordResetDao.remove(status);
}