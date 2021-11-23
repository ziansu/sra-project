@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_profile);
    butterknife.ButterKnife.bind(this);
    mApi = RestClient.ADAPTER.create(com.mobility.android.data.network.api.UserApi.class);
    mUser = com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser();
    mRefresh.setOnRefreshListener(this::loadUserInfo);
    mRefresh.setColorSchemeResources(Config.REFRESH_COLORS);
    loadUserInfo();
}