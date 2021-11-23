@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.about :
            startAboutActivity();
            break;
        case R.id.demo :
            mPresenter.demoPhotoRecognition();
            break;
        case R.id.use_last_photo :
            mPresenter.useLastPhoto();
            break;
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}