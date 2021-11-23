public fr.upem.geoplan.core.session.User getUserAccordingToEmail(java.lang.String emailUser) {
    android.os.Bundle data = new android.os.Bundle();
    data.putString("action", DataConstantGcm.RECEIVED_USER_ACCORDING_TO_EMAIL);
    data.putString(DataConstantGcm.EMAIL, emailUser);
    sendGCMMessage(data);
    return ((fr.upem.geoplan.core.session.User) (extractObjectFromDataLock(DataConstantGcm.RECEIVED_USER_ACCORDING_TO_EMAIL)));
}