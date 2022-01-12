public void checkAvailableFragmentRemove(java.lang.String tag) {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    android.app.Fragment fragment = fragmentManager.findFragmentByTag(tag);
    if (fragment != null) {
        fragmentTransaction.detach(fragmentManager.findFragmentByTag(tag)).commit();
    }
}