@java.lang.Override
public void refreshMyBookings() {
    android.app.FragmentManager fm = mActivity.getFragmentManager();
    android.app.Fragment currentFragment = fm.findFragmentByTag(MainActivity.MY_BOOKINGS_FRAGMENT_TAG);
    final android.app.FragmentTransaction ft = fm.beginTransaction();
    ft.detach(currentFragment);
    ft.attach(currentFragment);
    ft.commit();
}