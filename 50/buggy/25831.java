@java.lang.Override
protected java.lang.CharSequence queryValue() {
    android.net.Uri rideUri = getRideUri();
    if (rideUri == null)
        return "";
    
    return org.jraf.android.bikey.common.UnitUtil.formatSpeed(((float) (org.jraf.android.bikey.backend.log.LogManager.get().getAverageMovingSpeed(rideUri))));
}