public void replaceMenuFragment() {
    android.app.Fragment newFragment = fm.findFragmentById(R.id.fragmentContainer);
    newFragment = new testproject.halfmoonstudios.com.ponder.MenuFragment();
    android.app.FragmentTransaction transaction = fm.beginTransaction();
    transaction.setCustomAnimations(R.animator.fade_in, R.animator.fade_out);
    transaction.replace(R.id.fragmentContainer, newFragment);
    transaction.commit();
}