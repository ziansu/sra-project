@java.lang.Override
public void addFragment(android.support.v4.app.Fragment fragment, int stringResource) {
    com.framgia.fpoll.util.ActivityUtil.addFragmentToActivity(getSupportFragmentManager(), fragment, R.id.frame_layout);
    setTitle(stringResource);
}