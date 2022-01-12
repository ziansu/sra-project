@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_progress_page);
    this.setTitle(Titles.webserverServerSetupTitle);
    if ((com.capsicumcorp.iomy.apps.iomy.Settings.getRunFirstRunWizard(this)) == true) {
        this.showSnackbarPopup("Please wait while installation is in progress. This may take several minutes.");
    }else {
        this.showSnackbarPopup("Please wait while server services are starting up. This may take several minutes.");
    }
    this.startSettingUpWebserver();
}