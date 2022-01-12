void end() {
    android.view.animation.Animation hideFAB = android.view.animation.AnimationUtils.loadAnimation(getApplication(), R.anim.hide_fab);
    mFAB.startAnimation(hideFAB);
    mTabLayout.setVisibility(View.VISIBLE);
    mMenu.findItem(R.id.filter).setEnabled(true).setVisible(true);
    count = 0;
    selected.clear();
    mToolBar.setTitle(getTitle(mTabLayout.getSelectedTabPosition()));
    com.gilshelef.feedmeassociations.AdapterManager.get().clearSelectedViewAll();
}