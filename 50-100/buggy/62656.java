@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    mContext = inflater.getContext();
    android.view.View view = inflater.inflate(R.layout.fragment_picture, null);
    initViews(view);
    myApplication = ((com.myth.shishi.MyApplication) (((android.app.Activity) (mContext)).getApplication()));
    return view;
}