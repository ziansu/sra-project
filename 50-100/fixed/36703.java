private void replaceFragmentInternal(android.support.v4.app.FragmentManager fm, @android.support.annotation.IdRes
int containerId, android.support.v4.app.Fragment fragment, java.lang.String fragmentTag, android.os.Bundle args, boolean addToBackstack, java.lang.String backstackTag) {
    if (args != null) {
        fragment.setArguments(args);
    }
    android.support.v4.app.FragmentTransaction ft = fm.beginTransaction().replace(containerId, fragment, fragmentTag);
    if (addToBackstack) {
        ft.addToBackStack(backstackTag).commit();
        fm.executePendingTransactions();
    }else {
        ft.commitNow();
    }
}