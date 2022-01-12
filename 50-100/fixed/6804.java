@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    mDrawerLayout.closeDrawers();
    switch (menuItem.getItemId()) {
        case R.id.collect :
            openPage("collect", null, CoreAnim.slide);
            break;
        case R.id.update :
            update();
            break;
        case R.id.clear :
            clear();
            break;
        case R.id.about :
            openPage("about", null, CoreAnim.slide);
            break;
        default :
            break;
    }
    return true;
}