public void controlEvent(int event) {
    if ((event == (org.tanukisoftware.wrapper.WrapperManager.WRAPPER_CTRL_LOGOFF_EVENT)) && (org.tanukisoftware.wrapper.WrapperManager.isLaunchedAsService())) {
    }else {
        org.tanukisoftware.wrapper.WrapperManager.stop(0);
    }
}