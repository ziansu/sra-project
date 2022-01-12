public void run() {
    if ((target.getPreviousAlertLevel()) != alertLevel) {
        if ((alertLevelChangeListener) != null) {
            target.setAlertUserLevel(alertLevel);
            alertLevelChangeListener.onAlertLevelChange(alertLevel, target);
        }
    }
    if ((progressChangeListener) != null) {
        progressChangeListener.onProgressChange(this.location, target);
    }
}