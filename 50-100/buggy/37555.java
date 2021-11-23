protected void onNextButtonClicked() {
    CURRENT_PAGE = mViewPager.getCurrentItem();
    android.util.Log.d("CURRENT", java.lang.String.valueOf(CURRENT_PAGE));
    if (resolveNavigation()) {
        stepper.ivb.com.sample.library.stepperFragment current = ((stepper.ivb.com.sample.library.stepperFragment) (fragmentAdapter.getItem(CURRENT_PAGE)));
        if ((current != null) && (current.onNextButtonHandler())) {
            CURRENT_PAGE = (CURRENT_PAGE) + 1;
            mViewPager.setCurrentItem(CURRENT_PAGE);
        }
    }
}