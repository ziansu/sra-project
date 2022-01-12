public void selectDrawerItem(android.view.MenuItem menuItem) {
    switch (menuItem.getItemId()) {
        case R.id.nav_events :
            this.openFragment("Events");
            break;
        case R.id.nav_chats :
            this.openFragment("Chat");
            break;
        case R.id.nav_idea :
            this.openFragment("Idea");
            break;
        default :
            this.openFragment("default");
    }
    menuItem.setChecked(true);
    setTitle(menuItem.getTitle());
    mDrawer.closeDrawers();
}