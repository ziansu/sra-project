@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.about :
            startAboutActivity();
        case R.id.demo :
            mPresenter.demoPhotoRecognition();
        case R.id.use_last_photo :
            mPresenter.useLastPhoto();
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}