@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_bookdetails, menu);
    mMenu = menu;
    if (((flag) % 2) == 1) {
        mMenu.findItem(R.id.action_edit).setIcon(R.drawable.ic_done);
        (flag)++;
    }else {
        mMenu.findItem(R.id.action_edit).setIcon(R.drawable.ic_edit);
        (flag)++;
    }
    menuItem = menu.findItem(R.id.action_edit);
    return true;
}