private void loadListViewFragment(java.lang.String title) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = valdes.cindyslist.ListViewFragment.newInstance(title);
    fragmentManager.beginTransaction().add(R.id.list_view_activity_fragment_container, fragment).commit();
}