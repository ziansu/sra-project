@java.lang.Override
public void onResume() {
    super.onResume();
    updateSources();
    android.content.IntentFilter packageChangeIntentFilter = new android.content.IntentFilter();
    packageChangeIntentFilter.addAction(Intent.ACTION_PACKAGE_ADDED);
    packageChangeIntentFilter.addAction(Intent.ACTION_PACKAGE_CHANGED);
    packageChangeIntentFilter.addAction(Intent.ACTION_PACKAGE_REPLACED);
    packageChangeIntentFilter.addAction(Intent.ACTION_PACKAGE_REMOVED);
    packageChangeIntentFilter.addDataScheme("package");
    getActivity().registerReceiver(mPackagesChangedReceiver, packageChangeIntentFilter);
}