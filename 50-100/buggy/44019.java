public void onClick(android.view.View v) {
    switch (chooseItem) {
        case com.otosoft.setupwizard.SetupWizardActivity.CHOOSE_CHINA_ITEM :
            com.otosoft.setupwizard.SetupWizardActivity.mCurrentLocale = java.util.Locale.CHINA;
            updateLocale(com.otosoft.setupwizard.SetupWizardActivity.mCurrentLocale);
            break;
        case com.otosoft.setupwizard.SetupWizardActivity.CHOOSE_ENGLISH_ITEM :
            com.otosoft.setupwizard.SetupWizardActivity.mCurrentLocale = java.util.Locale.US;
            updateLocale(com.otosoft.setupwizard.SetupWizardActivity.mCurrentLocale);
            break;
        default :
            updateLocale(com.otosoft.setupwizard.SetupWizardActivity.mCurrentLocale);
            break;
    }
    this.startActivity(this.buildWifiSetupIntent());
}