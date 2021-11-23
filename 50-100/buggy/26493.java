@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.viewpager_fragment, container, false);
    try {
        mProperties = readAssets(getAssetName());
    } catch (java.io.IOException e) {
        android.util.Log.e(TAG, "onCreateView: exception occured while getting assets", e);
    }
    mArrayListSize = mProperties.size();
    initViewPager(view);
    return view;
}