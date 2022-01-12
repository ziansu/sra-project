public void setFragment(android.support.v4.app.Fragment fragment) {
    if (fragment != null) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content_main, fragment);
        ft.commit();
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
}