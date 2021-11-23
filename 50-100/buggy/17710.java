@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu, menu);
    if (!(BuildConfig.DEBUG)) {
        menu.findItem(R.id.settings).setVisible(false);
        menu.findItem(R.id.database).setVisible(false);
        menu.findItem(R.id.export_as_picture).setVisible(false);
    }
    return true;
}