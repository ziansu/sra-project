@java.lang.Override
public void run() {
    Settings.Secure.putString(mContext.getContentResolver(), "screensaver_components", (((mContext.getApplicationInfo().packageName) + "/") + (com.komok.dreamapprunner.DreamAppRunnerService.class.getName())));
}