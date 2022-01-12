@java.lang.Override
public void onBackPressed() {
    if (io.geeteshk.hyper.MainActivity.mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
        io.geeteshk.hyper.MainActivity.mDrawerLayout.closeDrawers();
    }else {
        super.onBackPressed();
    }
}