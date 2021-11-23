public void categorySelected(org.unpidf.univmobile.data.entities.Category cat) {
    onBackPressed();
    android.app.FragmentManager manager = getFragmentManager();
    org.unpidf.univmobile.ui.fragments.GeoCampusFragment f = ((org.unpidf.univmobile.ui.fragments.GeoCampusFragment) (manager.findFragmentByTag(org.unpidf.univmobile.ui.fragments.GeoCampusFragment.class.getName())));
    if (f != null) {
        f.categorySelected(cat);
    }
}