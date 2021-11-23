private boolean isXLargeTablet() {
    return ((context.getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK)) >= (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE);
}