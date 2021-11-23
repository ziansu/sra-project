@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((hu.zokni1996.android_forum.Main.Settings.actionBar) != null)
        hu.zokni1996.android_forum.Main.Settings.actionBar.setIcon(R.drawable.ic_action_report_problem);
    
    addPreferencesFromResource(R.xml.settings_rules);
}