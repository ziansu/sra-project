public boolean shouldDisplayHomeUp() {
    boolean canBack = false;
    try {
        canBack = (getFragmentManager().getBackStackEntryCount()) > 0;
    } catch (java.lang.Exception ex) {
        android.util.Log.e(getClass().getCanonicalName(), ex.getMessage());
    }
    if (canBack) {
        mainActivity.drawerDisable();
    }else {
        mainActivity.drawerEnable();
    }
    return canBack;
}