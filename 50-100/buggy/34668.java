@java.lang.Override
public void onMobileDataSignalChanged(boolean enabled, int mobileSignalIconId, java.lang.String mobileSignalContentDescriptionId, int dataTypeIconId, boolean activityIn, boolean activityOut, java.lang.String dataTypeContentDescriptionId, java.lang.String description, boolean noSim, boolean isDataTypeIconWide) {
    mInfo.enabled = enabled;
    mInfo.mobileSignalIconId = mobileSignalIconId;
    mInfo.signalContentDescription = mobileSignalContentDescriptionId;
    mInfo.dataTypeIconId = dataTypeIconId;
    mInfo.dataContentDescription = dataTypeContentDescriptionId;
    mInfo.activityIn = activityIn;
    mInfo.activityOut = activityOut;
    mInfo.enabledDesc = description;
    mInfo.noSim = noSim;
    mInfo.isDataTypeIconWide = isDataTypeIconWide;
    refreshState(mInfo);
}