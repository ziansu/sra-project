private boolean sendPswRecoveryCode(java.lang.String userId) {
    switch (appReader.control.Control.model.sendPswRecoveryCode(userId)) {
        case 0 :
            return true;
        default :
            return false;
    }
}