void switchTo(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction t = getSupportFragmentManager().beginTransaction();
    t.setCustomAnimations(R.anim.frag_slide_in, R.anim.frag_slide_out);
    fragment.getView().bringToFront();
    t.hide(currentFragment);
    t.show(fragment);
    currentFragment = fragment;
    t.addToBackStack(null);
    t.commit();
}