@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.content.Intent intent;
    android.support.v4.app.Fragment current = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);
    switch (item.getItemId()) {
        case R.id.ml_menu_open_mrl :
            onOpenMRL();
            break;
    }
    return super.onOptionsItemSelected(item);
}