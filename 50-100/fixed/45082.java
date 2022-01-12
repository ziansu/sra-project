@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((mRootView) == null) {
        mRootView = inflater.inflate(R.layout.weather_fragment, container, false);
        initViews(mRootView, savedInstanceState);
        isPrepared = true;
        isLoaded = false;
        mHandler.removeCallbacks(delayRefresh);
        mHandler.post(delayRefresh);
    }else {
    }
    return mRootView;
}