public void loadSettings(ccre.holders.TuningContext context) {
    this.nudge = context.getFloat("Auto Mode Three Totes Nudge +A", 1.0F);
    this.toteDistance = context.getFloat("Auto Mode Three Totes Tote Distance +A", 7.0F);
    this.autoZoneDistance = context.getFloat("Auto Mode Three Totes Auto Zone Distance +A", 5.0F);
    this.collectFirstContainer = context.getBoolean("Auto Mode Three Totes Collect First Container +A", true);
    this.collectSecondContainer = context.getBoolean("Auto Mode Three Totes Collect Second Container +A", true);
}