private boolean isRoaming() {
    if (isCdma()) {
        final int iconMode = mServiceState.getCdmaEriIconMode();
        return ((mServiceState.getCdmaEriIconIndex()) != (com.android.internal.telephony.cdma.EriInfo.ROAMING_INDICATOR_OFF)) && ((iconMode == (com.android.internal.telephony.cdma.EriInfo.ROAMING_ICON_MODE_NORMAL)) || (iconMode == (com.android.internal.telephony.cdma.EriInfo.ROAMING_ICON_MODE_FLASH)));
    }else {
        return ((mServiceState) != null) && (mServiceState.getRoaming());
    }
}