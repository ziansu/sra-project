private void startNextActivity() {
    android.content.Intent intent;
    if (new com.muzima.service.WizardFinishPreferenceService(this).isWizardFinished()) {
        intent = new android.content.Intent(getApplicationContext(), com.muzima.view.MainActivity.class);
    }else {
        intent = new android.content.Intent(getApplicationContext(), com.muzima.view.cohort.CohortWizardActivity.class);
    }
    startActivity(intent);
    finish();
}