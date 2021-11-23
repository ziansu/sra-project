@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().add(R.id.settings_fragment, new com.dbtest.ivan.app.fragment.SettingsFragment()).commit();
}