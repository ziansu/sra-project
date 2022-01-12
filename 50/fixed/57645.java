@java.lang.Override
public void onBackPressed() {
    if (mConfig.debugModeEnabled)
        return ;
    
    dismissRecentsToFocusedTaskOrHome(true);
}