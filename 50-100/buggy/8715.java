@java.lang.Override
public void run() {
    android.view.Window window = this.cordova.getActivity().getWindow();
    window.addFlags(LayoutParams.FLAG_DISMISS_KEYGUARD);
    window.addFlags(LayoutParams.FLAG_SHOW_WHEN_LOCKED);
    window.addFlags(LayoutParams.FLAG_TURN_SCREEN_ON);
    android.util.Log.v(com.applurk.plugin.ScreenLocker.TAG, ("ScreenLocker received SUCCESS:" + action));
    callbackContext.success();
}