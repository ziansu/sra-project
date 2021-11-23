public void setLeftNavigationBar() {
    if ((drawerLayout) != null) {
        drawerLayout = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
    }
    user = com.vsokoltsov.uprogress.authentication.models.AuthorizationService.getInstance().getCurrentUser();
    navigationView = ((android.support.design.widget.NavigationView) (findViewById(R.id.nav_view)));
    navigationPresenter = new com.vsokoltsov.uprogress.navigation.NavigationPresenter(navigationView, drawerLayout, this, user, getAcionBarToggler());
    navigationPresenter.setUpNavigation();
}