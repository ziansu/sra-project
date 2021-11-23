@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.eyeseetea.malariacare.database.utils.PreferencesState.getInstance().init(getApplicationContext());
    com.raizlabs.android.dbflow.config.FlowManager.init(this);
}