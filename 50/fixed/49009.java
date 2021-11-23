public void changeFragment(android.support.v4.app.Fragment newFragment, android.support.v4.app.FragmentTransaction mFragmentManager) {
    android.support.v4.app.FragmentTransaction transaction = mFragmentManager;
    transaction.replace(R.id.content_frame, newFragment);
    transaction.addToBackStack(null);
    transaction.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
    transaction.commit();
}