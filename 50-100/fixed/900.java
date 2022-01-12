@java.lang.Override
public void run() {
    mCurrentFragment = getHomeFragment();
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
    fragmentTransaction.replace(R.id.content_main, mCurrentFragment, androks.simplywash.activities.MainActivity.CURRENT_TAG);
    fragmentTransaction.commitAllowingStateLoss();
    setToolbarTitle();
}