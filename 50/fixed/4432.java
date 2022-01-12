@java.lang.Override
public void success(java.util.List<com.google.android.apps.forscience.whistlepunk.metadata.SensorTrigger> triggers) {
    startObservingWithTriggers(readOptions, triggers);
    updateCardMenu();
}