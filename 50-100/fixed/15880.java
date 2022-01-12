private void setAppMode(boolean b) {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction ft = fragmentManager.beginTransaction();
    android.app.Fragment fragment = (b) ? new com.hsfl.speakshot.ui.SearchFragment() : new com.hsfl.speakshot.ui.ReadFragment();
    ft.replace(R.id.fragment_container, fragment);
    ft.commit();
}