public void clickAction() {
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.Fragment fragment;
    if (onMainScreen) {
        fragment = mGameListFragment;
    }else {
        fragment = mEditFragment;
    }
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.content_frame, fragment);
    fragmentTransaction.commit();
}