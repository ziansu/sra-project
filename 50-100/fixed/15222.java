void setShotType(java.lang.String shotType) {
    getAdvStats().shotType(convertStringToShotType(context, shotType));
    getAdvStats().clearAngle();
    getAdvStats().clearSubType();
    getAdvStats().clearHowTypes();
    getAdvStats().clearWhyTypes();
}