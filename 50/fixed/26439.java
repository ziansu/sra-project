public static void newInstance() {
    if (((com.cooper.wheellog.utils.InMotionAdapter.INSTANCE) != null) && ((com.cooper.wheellog.utils.InMotionAdapter.INSTANCE.keepAliveTimer) != null)) {
        com.cooper.wheellog.utils.InMotionAdapter.INSTANCE.keepAliveTimer.cancel();
        com.cooper.wheellog.utils.InMotionAdapter.INSTANCE.keepAliveTimer = null;
    }
    com.cooper.wheellog.utils.InMotionAdapter.INSTANCE = new com.cooper.wheellog.utils.InMotionAdapter();
}