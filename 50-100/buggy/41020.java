@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_detail_photo, menu);
    mFinishMenuItem = menu.findItem(R.id.action_finish);
    mPhotoDetailPresenter.initMenu();
    if ((mViewPager.getAdapter()) == null) {
        setToolbarTitle("0/0");
    }
    return true;
}