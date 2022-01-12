@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    mOptionMenu = menu;
    getMenuInflater().inflate(R.menu.configure_menu, menu);
    menu.findItem(R.id.menu_item_redo).setVisible(false);
    menu.findItem(R.id.menu_item_undo).setVisible(false);
    return true;
}