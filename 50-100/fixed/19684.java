public void prepareBackgroundManager() {
    mBackgroundManager = android.support.v17.leanback.app.BackgroundManager.getInstance(getActivity());
    mBackgroundManager.attach(getActivity().getWindow());
    mDefaultBackground = getResources().getDrawable(R.drawable.default_background);
    mMetrics = new android.util.DisplayMetrics();
    getActivity().getWindowManager().getDefaultDisplay().getMetrics(mMetrics);
}