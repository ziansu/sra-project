private void setupUIElements() {
    try {
        setBadgeDrawable(getActivity().getResources().getDrawable(R.mipmap.ic_launcher));
        setTitle(getString(R.string.app_name));
        setHeadersState(com.felkertech.cumulustv.tv.fragments.HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);
        setBrandColor(getResources().getColor(R.color.colorPrimary));
        mBackgroundManager.setDrawable(getResources().getDrawable(R.drawable.c_background5));
    } catch (java.lang.Exception ignored) {
    }
}