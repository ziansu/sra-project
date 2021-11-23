private boolean resetTouchEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWTouchProfile.sFlagTouchEventManage &= ~flag;
    if ((org.deviceconnect.android.deviceplugin.sw.profile.SWTouchProfile.sFlagTouchEventManage) == 0) {
        return false;
    }
    return true;
}