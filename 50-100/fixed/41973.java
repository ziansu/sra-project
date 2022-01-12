public void addSlide(@android.support.annotation.NonNull
android.support.v4.app.Fragment fragment) {
    fragments.add(fragment);
    mPagerAdapter.notifyDataSetChanged();
    slidesNumber = fragments.size();
    if ((mController) != null) {
        mController.initialize(fragments.size());
    }
}