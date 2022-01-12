@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mDataManager = com.android.casopisinterfon.interfon.data.DataManager.getInstance();
    mNetManager = com.android.casopisinterfon.interfon.internet.NetworkManager.getInstance(java.security.AccessController.getContext());
    android.os.Bundle a = getArguments();
    mFragPosition = a.getInt(com.android.casopisinterfon.interfon.activity.fragment.ArticlesFragment.POSITION_ARG);
    initialDownload();
}