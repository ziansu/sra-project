public void onStartMultiTouch(android.view.View view) {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = fm.beginTransaction();
    transaction.add(R.id.container, new org.sensors2.osc.fragments.MultiTouchFragment());
    transaction.addToBackStack(null);
    transaction.commit();
}