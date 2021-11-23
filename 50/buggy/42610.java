@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.fragment_preference);
    configureCurrenciesPref();
    configureNotificationsCB();
}