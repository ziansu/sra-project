void back(android.support.v4.app.FragmentManager fragmentManager) {
    int count = fragmentManager.getBackStackEntryCount();
    if (count > 1) {
        handleBack(fragmentManager);
    }
}