@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_done, menu);
    menu.getItem(0).setVisible(false);
    return true;
}