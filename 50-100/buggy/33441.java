public void decreaseTimeout() {
    try {
        Settings.System.putInt(gr.ictpro.jsalatas.screenoff.application.ScreenOffApplication.getContext().getContentResolver(), Settings.System.SCREEN_OFF_TIMEOUT, 0);
        Settings.Global.putString(gr.ictpro.jsalatas.screenoff.application.ScreenOffApplication.getContext().getContentResolver(), Settings.Global.STAY_ON_WHILE_PLUGGED_IN, "0");
    } catch (java.lang.SecurityException ex) {
    }
}