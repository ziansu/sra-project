public void showElementInfo(de.blau.android.osm.OsmElement element) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
    android.support.v4.app.Fragment prev = fm.findFragmentByTag("fragment_element_info");
    if (prev != null) {
        ft.remove(prev);
    }
    ft.commit();
    de.blau.android.ElementInfoFragment elementInfoDialog = de.blau.android.ElementInfoFragment.newInstance(element);
    elementInfoDialog.show(fm, "fragment_element_info");
}