@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.eyeseetea.malariacare.database.utils.PreferencesState.getInstance().setContext(getApplicationContext());
    com.raizlabs.android.dbflow.config.FlowManager.init(this);
}