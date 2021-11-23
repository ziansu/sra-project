@java.lang.Override
public void onDrawerClosed(android.view.View drawerView) {
    super.onDrawerClosed(drawerView);
    if (navigationView.getMenu().findItem(R.id.menu_colors).isChecked()) {
        com.chenguang.materialpalette.activity.MainActivity.start(this);
        finish();
    }else
        if (navigationView.getMenu().findItem(R.id.menu_about).isChecked()) {
            com.chenguang.materialpalette.activity.AboutAppActivity.start(this);
        }
    
}