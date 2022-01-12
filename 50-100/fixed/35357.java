public android.support.v4.app.Fragment getVisibleFragment() {
    android.support.v4.app.FragmentManager fragmentManager = mFragmentManager;
    java.util.List<android.support.v4.app.Fragment> fragments = fragmentManager.getFragments();
    for (int i = (fragments.size()) - 1; i > (-1); i--) {
        android.support.v4.app.Fragment fragment = fragments.get(i);
        if ((fragment != null) && (fragment.isVisible()))
            return fragment;
        
    }
    return null;
}