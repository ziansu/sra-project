@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
    switch (menuItem.getItemId()) {
        case R.id.list_navigation_menu_item :
            break;
        case R.id.statistics_navigation_menu_item :
            android.content.Intent intent = new android.content.Intent(this, com.example.android.architecture.blueprints.todoapp.statistics.StatisticsActivity.class);
            intent.addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
            startActivity(intent);
            break;
        default :
            break;
    }
    menuItem.setChecked(true);
    mDrawerLayout.closeDrawers();
    return true;
}