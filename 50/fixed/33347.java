private void loadPreferences() {
    de.lin_engel.robopongcontroller.RobopongApp.UserPrefs userPrefs = de.lin_engel.robopongcontroller.RobopongApp.getUserPrefs();
    mPauseKnob.setValue(userPrefs.mPausePercentage);
    mSpeedKnob.setValue(userPrefs.mSpeedPercentage);
    mAngleKnob.setValue(de.lin_engel.robopongcontroller.RobopongApp.getAllUserPrefs().mAnglePercentage);
}