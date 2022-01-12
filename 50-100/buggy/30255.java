@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tracked_apps);
    filterSystemPackage();
    in.ac.iiitd.dhcs.focus.TrackedAppsAcitivity.listView = ((android.widget.ListView) (findViewById(R.id.listView)));
    in.ac.iiitd.dhcs.focus.TrackedAppsAcitivity.trackedAppsListAdapter = new in.ac.iiitd.dhcs.focus.ListAdapters.TrackedAppListAdapter(this, R.layout.tracked_apps_list_item, in.ac.iiitd.dhcs.focus.TrackedAppsAcitivity.userPackageInfoList);
    in.ac.iiitd.dhcs.focus.TrackedAppsAcitivity.listView.setAdapter(in.ac.iiitd.dhcs.focus.TrackedAppsAcitivity.trackedAppsListAdapter);
}