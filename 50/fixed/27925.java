@java.lang.Override
public void run() {
    try {
        controller.sendString(cmd);
    } catch (java.lang.Exception e) {
        android.util.Log.w(de.hhn.munz.ardrone2.ControlActivity.TAG, e.getMessage());
    }
}