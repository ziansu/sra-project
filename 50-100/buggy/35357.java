public android.support.v4.app.Fragment getVisibleFragment() {
    android.support.v4.app.FragmentManager fragmentManager = mFragmentManager;
    java.util.List<android.support.v4.app.Fragment> fragments = fragmentManager.getFragments();
    for (android.support.v4.app.Fragment fragment : fragments) {
        if ((fragment != null) && (fragment.isVisible()))
            return fragment;
        
    }
    return null;
}