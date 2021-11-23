private void updateSpeed() {
    java.lang.String speed = "";
    if ((mode) == (groupstierna.stiernacontroller.MainActivity.Keyword.MANUAL)) {
        speed = java.lang.Integer.toString(((seekBarManualSpeed.getProgress()) - 100));
    }else {
        speed = java.lang.Integer.toString(seekBarACCSpeed.getProgress());
    }
    trySend((((groupstierna.stiernacontroller.MainActivity.Keyword.DRIVE.getMessage()) + " ") + speed));
}