private void removeFilterFragment() {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    if ((fragmentManager.findFragmentByTag(FILTER_FRAGMENT_TAG)) != null) {
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.filter_fragment_slide_in, R.anim.filter_fragment_slide_out);
        transaction.remove(filterFragment);
        transaction.commit();
        filterFragment = null;
    }
}