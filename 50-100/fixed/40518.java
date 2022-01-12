public void showFeedback(eu.musesproject.client.model.decisiontable.Decision decision) {
    android.util.Log.d(eu.musesproject.client.actuators.ActuatorController.TAG, "called: showFeedback(Decision decision)");
    dbManager.openDB();
    boolean isSilentModeActive = dbManager.isSilentModeActive();
    dbManager.closeDB();
    if ((decision != null) && isSilentModeActive) {
        decision.setName(Decision.GRANTED_ACCESS);
    }
    feedbackActuator.showFeedback(decision);
}