@java.lang.Override
public void run() {
    final double takeOffAltitude = getAppPrefs().getDefaultAltitude();
    getDrone().doGuidedTakeoff(takeOffAltitude);
}