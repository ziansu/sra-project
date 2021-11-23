@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu_tik_button, menu);
    menuItemTik = menu.findItem(R.id.action_tik);
    if (!(isLocationInitialized))
        menuItemTik.setVisible(false);
    else
        menuItemTik.setVisible(true);
    
    return true;
}