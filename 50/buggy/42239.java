public void controlEvent(int event) {
    if ((event == (org.tanukisoftware.wrapper.WrapperManager.WRAPPER_CTRL_LOGOFF_EVENT)) && ((org.tanukisoftware.wrapper.WrapperManager.isLaunchedAsService()) || (org.tanukisoftware.wrapper.WrapperManager.isIgnoreUserLogoffs()))) {
    }else {
        org.tanukisoftware.wrapper.WrapperManager.stop(0);
    }
}