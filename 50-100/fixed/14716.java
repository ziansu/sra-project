@java.lang.Override
public void onBackPressed() {
    android.app.Fragment fragment = fragmentManager.findFragmentByTag("BusSchedule");
    if (fragment != null) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();
    }else {
        super.onBackPressed();
    }
}