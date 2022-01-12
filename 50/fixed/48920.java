@java.lang.Override
public void onExperimentError() {
    android.util.Log.i(GlassConfig.TAG, "Experiment callbacks. On error");
    super.isExperimentRunning.set(false);
}