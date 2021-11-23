private void updateSpeed() {
    java.lang.String speed = "";
    if (mode.getMessage().matches(groupstierna.stiernacontroller.MainActivity.Keyword.MANUAL.getMessage())) {
        speed = java.lang.Integer.toString(seekBarManualSpeed.getProgress());
    }else {
        speed = java.lang.Integer.toString(((seekBarACCSpeed.getProgress()) - 100));
    }
    trySend((((groupstierna.stiernacontroller.MainActivity.Keyword.DRIVE.getMessage()) + " ") + speed));
}