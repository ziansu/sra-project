private void showSubmitBarFragment(android.app.Fragment submitBarFragment) {
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
    ft.show(submitBarFragment);
}