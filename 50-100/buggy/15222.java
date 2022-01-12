void setShotType(java.lang.String shotType) {
    getAdvStats().shotType(com.brookmanholmes.bma.utils.MatchDialogHelperUtils.convertStringToShotType(context, shotType));
    getAdvStats().clearAngle();
    getAdvStats().clearSubType();
    getAdvStats().clearHowTypes();
    getAdvStats().clearWhyTypes();
}