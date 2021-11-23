public void addSlide(@android.support.annotation.NonNull
android.support.v4.app.Fragment fragment) {
    if (isRtlLayout()) {
        fragments.add(0, fragment);
    }else {
        fragments.add(fragment);
    }
    mPagerAdapter.notifyDataSetChanged();
    slidesNumber = fragments.size();
    if ((mController) != null) {
        mController.initialize(fragments.size());
    }
}