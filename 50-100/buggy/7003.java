@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        android.content.Intent intent = getIntent();
        if (intent.getBooleanExtra(fr.gaulupeau.apps.Poche.ui.preferences.ConnectionWizardActivity.EXTRA_SKIP_WELCOME, false)) {
            next(fr.gaulupeau.apps.Poche.ui.preferences.ConnectionWizardActivity.PAGE_WELCOME, null);
        }else {
            next(((java.lang.String) (null)), null);
        }
    }else {
        android.util.Log.w(fr.gaulupeau.apps.Poche.ui.preferences.ConnectionWizardActivity.TAG, "onCreate() savedInstanceState != null");
    }
}