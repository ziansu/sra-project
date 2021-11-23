@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.v(TAG, "onCreateView()");
    mContentView = inflater.inflate(R.layout.fragment_now_playing, container, false);
    return mContentView;
}