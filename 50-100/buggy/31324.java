public void submitStoredScore() {
    int firstLaunch = com.buggy.blocks.utils.PreferencesManager.getPreference(PreferencesManager.PREF_FIRST_LAUNCH);
    Gdx.app.log(com.buggy.blocks.BuggyGame.LOG_TAG, ((com.buggy.blocks.utils.PreferencesManager.getPreference(PreferencesManager.PREF_FIRST_LAUNCH)) + " First launch"));
    if (0 == firstLaunch) {
        com.buggy.blocks.utils.PreferencesManager.setPreference(PreferencesManager.PREF_FIRST_LAUNCH, 1);
        int highScore = com.buggy.blocks.utils.PreferencesManager.getPreference(PreferencesManager.PREF_SCORE);
        if (0 != highScore) {
            Gdx.app.log(com.buggy.blocks.BuggyGame.LOG_TAG, "Preparing to submit high score.");
            com.buggy.blocks.BuggyGame.android.submitStoredScore(highScore);
        }
    }
}