@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.d("HOME_PAGE", "Menu item is selected");
    switch (item.getItemId()) {
        case R.id.logOut :
            {
                clearSettings();
                goToStartPage();
            }
        default :
            {
                break;
            }
    }
    return true;
}