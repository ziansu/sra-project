protected void intalizeDrawer() {
    moveDrawerToTop();
    mDrawerLayout = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    menuItems = getResources().getStringArray(R.array.side_menu_items);
    mDrawerList = ((android.widget.ListView) (findViewById(R.id.left_drawer)));
    mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
    slideMenuAdapter = new com.svs.hztb.Adapters.SlideMenuAdapter(getApplicationContext(), menuItems);
    mDrawerList.setAdapter(slideMenuAdapter);
}