public boolean isScreenSizeAtLeast(int screenSize) {
    int currentScreenSize = (android.support.test.InstrumentationRegistry.getContext().getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK);
    return currentScreenSize >= screenSize;
}