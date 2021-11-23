private boolean sendPswRecoveryCode(java.lang.String userId) {
    switch (appReader.control.Control.model.sendPswRecoveryCode(userId)) {
        case 0 :
            appReader.Util.showInfo(Util.ACODESENT);
            return true;
        default :
            return false;
    }
}