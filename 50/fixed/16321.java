@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.vpn_profile_list);
    setHasOptionsMenu(true);
    refreshList();
}