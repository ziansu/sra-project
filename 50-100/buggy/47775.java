@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_test_mode :
            mPresenter.testMode();
            break;
        case R.id.action_rename :
            mPresenter.renameDevice();
            break;
        case R.id.action_close :
            finish();
            break;
        case R.id.action_check_update :
            mPresenter.checkUpdate();
            break;
        case R.id.action_resume_factory_reset :
            mPresenter.resetFactory();
            break;
        case R.id.action_unconnect :
            mPresenter.removeDevice();
            break;
    }
    return false;
}