public void run() {
    if ((target.getPreviousAlertLevel()) != alertLevel) {
        if ((alertLevelChangeListener) != null) {
            target.setAlertUserLevel(alertLevel);
            alertLevelChangeListener.onAlertLevelChange(alertLevel, target);
        }
    }
    progressChangeListener.onProgressChange(this.location, target);
}