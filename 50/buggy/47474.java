@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.System.out.println("yoooo");
    addPreferencesFromResource(R.xml.preferences);
    update_remove_interest_values();
}