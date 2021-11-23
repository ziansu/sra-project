private void initialiseFragments() {
    androidMonitorFragment = new com.example.blah.mobilestudio.AndroidMonitor.AndroidMonitorFragment();
    folderStructureFragment = new com.example.blah.mobilestudio.fileTreeView.FolderStructureFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    java.lang.String filePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    bundle.putString(FolderStructureFragment.FILE_PATH, filePath);
    folderStructureFragment.setArguments(bundle);
    resetBreadcrumb(filePath);
    getSupportFragmentManager().beginTransaction().add(R.id.top_monitor_resizer_vertical_fragment, veritcalResizerFragment).add(R.id.explorer_fragment, folderStructureFragment).add(R.id.android_monitor, androidMonitorFragment).commit();
}