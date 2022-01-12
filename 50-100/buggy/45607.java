@java.lang.Override
public void onBackPressed() {
    if (isRenameOpen) {
        android.view.View v = postRenameAction();
        if (v != null)
            v.performClick();
        
        return ;
    }
    if (recyclerViewAdapter.isInSelectinMode()) {
        recyclerViewAdapter.exitSelectinMode();
        activateDelete(false);
        activateRename(false);
        return ;
    }
    switch (fabState) {
        case 1 :
            cancelDeviceSearch(true);
            return ;
        case 2 :
            cancelNewDevice();
            return ;
    }
    finish();
}