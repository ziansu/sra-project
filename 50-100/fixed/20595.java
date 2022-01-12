@java.lang.Override
public void onClick(android.view.View v) {
    if ((getSupportFragmentManager().getBackStackEntryCount()) > 1) {
        getSupportFragmentManager().popBackStack();
    }else
        if (drawer != null) {
            if (!(drawer.isDrawerOpen(GravityCompat.START))) {
                drawer.openDrawer(GravityCompat.START);
            }
        }
    
}