public void sharedPreferences() {
    savingAndLoading = new com.bettehem.skijudgingsteno.SharedPreferencesSavingAndLoading();
    savingAndLoading.preferenceFilename = savingAndLoading.originalPreferenceFilename;
    savingAndLoading.saveStringArray(this, "eventTypes", eventTypes);
    savingAndLoading.saveStringArray(this, "competitorsUse", competitorsUse);
    savingAndLoading.preferenceFilename = "Events";
    savingAndLoading.saveBoolean(this, "hasCreatedEvents", false);
    savingAndLoading.preferenceFilename = savingAndLoading.originalPreferenceFilename;
    isTutorialCompleted = savingAndLoading.loadBoolean(this, "isTutorialCompleted");
    if (!(isTutorialCompleted)) {
        startActivity(openTutorial);
    }
}