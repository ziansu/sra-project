private void setUpNavigationDrawer() {
    drawerAdapter = new com.blstream.studybox.components.DrawerAdapter(this, navigationView, drawerLayout, toolbar);
    drawerAdapter.attachDrawer();
}