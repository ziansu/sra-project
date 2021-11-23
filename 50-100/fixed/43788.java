@java.lang.Override
protected void onResume() {
    super.onResume();
    if (justCreated) {
        if (org.telegram.android.LocaleController.isRTL) {
            viewPager.setCurrentItem(6);
            lastPage = 6;
        }else {
            viewPager.setCurrentItem(0);
            lastPage = 0;
        }
        justCreated = false;
    }
}