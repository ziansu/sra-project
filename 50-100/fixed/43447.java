@java.lang.Override
public void requestExitOneStepMode() {
    enforceSidebarService();
    android.util.Slog.d(com.android.server.onestep.OneStepManagerService.TAG, (((("[Uid: " + (android.os.Binder.getCallingUid())) + ", Pid: ") + (android.os.Binder.getCallingPid())) + "] requestExitSidebarMode"));
    if (isInOneStepMode()) {
        android.util.Slog.w(com.android.server.onestep.OneStepManagerService.TAG, "Not in sidebar mode, no need to do ExitSidebarMode");
    }else {
        mLastResetMode = mSideBarMode;
        if ((mThumbModeHelper) != null) {
            mThumbModeHelper.resetWindowState();
        }
    }
}