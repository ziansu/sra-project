public void setFragment(android.support.v4.app.Fragment fragment) {
    if (fragment != null) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (fragment instanceof sit374_team17.propertyinspector.Fragment_CreateProperty) {
            ft.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
            ft.addToBackStack(null);
        }
        ft.replace(R.id.content_main, fragment);
        ft.commit();
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
}