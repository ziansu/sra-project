protected void addAndShowFragment(int containerViewId, android.support.v4.app.Fragment fragment, java.lang.String tag) {
    android.support.v4.app.FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
    android.support.v4.app.Fragment existingFragment = getSupportFragmentManager().findFragmentByTag(tag);
    if ((existingFragment != null) && (existingFragment == fragment)) {
        fragmentTransaction.show(fragment);
    }else {
        fragmentTransaction.add(containerViewId, fragment, tag);
        fragmentTransaction.commit();
    }
}