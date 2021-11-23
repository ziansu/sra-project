public void filter(java.lang.String searchTerm) {
    for (android.support.v4.app.Fragment currentFragment : fragments) {
        de.fhws.campusapp.fragment.ModuleListFragment moduleFragment = ((de.fhws.campusapp.fragment.ModuleListFragment) (currentFragment));
        if (moduleFragment.isVisible()) {
            moduleFragment.filter(searchTerm);
        }
    }
}