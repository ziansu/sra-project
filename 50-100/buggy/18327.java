@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode actionMode) {
    if ((zipExplorerAdapter) != null)
        zipExplorerAdapter.toggleChecked(false, "");
    
    selection = false;
    mainActivity.updateViews(mainActivity.getColorPreference().getDrawable(com.amaze.filemanager.utils.color.ColorUsage.getPrimary(MainActivity.currentTab)));
    if ((Build.VERSION.SDK_INT) >= 21) {
        android.view.Window window = getActivity().getWindow();
        if (mainActivity.colourednavigation)
            window.setNavigationBarColor(mainActivity.skinStatusBar);
        
    }
    mActionMode = null;
}