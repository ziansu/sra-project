@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);
    if ((de.danoeh.antennapod.activity.PreferenceActivity.instance.preferenceController) != null) {
        de.danoeh.antennapod.activity.PreferenceActivity.instance.preferenceController.onCreate();
    }
}