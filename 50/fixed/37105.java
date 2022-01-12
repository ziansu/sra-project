private void showFragment(android.support.v4.app.Fragment fragment, java.lang.String tag) {
    work.beltran.discogsbrowser.ui.main.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    ft.replace(R.id.fragment_container, fragment, tag);
    ft.commit();
}