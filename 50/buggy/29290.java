private void setUpNavigationDrawer() {
    com.blstream.studybox.components.DrawerAdapter drawerAdapter = new com.blstream.studybox.components.DrawerAdapter(this, navigationView, drawerLayout, toolbar);
    drawerAdapter.attachDrawer();
}