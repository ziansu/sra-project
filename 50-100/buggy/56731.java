@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.logout :
            logout();
            return true;
        case R.id.search :
            startActivity(new android.content.Intent(this, com.alex.lighthub.views.SearchActivity.class));
            return true;
        case R.id.refresh :
            com.alex.lighthub.views.MainActivity.presenter.loadData();
            return true;
        case R.id.exit :
            com.alex.lighthub.views.MainActivity.presenter = null;
            finish();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}