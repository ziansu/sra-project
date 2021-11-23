@java.lang.Override
public void onTimeTick() {
    super.onTimeTick();
    android.util.Log.e("[32mONTIMETICK[0m", ("" + (java.lang.System.currentTimeMillis())));
    invalidate();
}