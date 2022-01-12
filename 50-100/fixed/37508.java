@java.lang.Override
public void initView(android.os.Bundle savedInstanceState) {
    super.initView(savedInstanceState);
    setTitle(R.string.app_name);
    mDoubleClickExitHelper = new com.classic.core.utils.DoubleClickExitHelper(mActivity);
    checkStoragePermissions();
    initTabBar(savedInstanceState);
    com.classic.wages.utils.PgyerUtil.register(mAppContext);
    com.classic.wages.utils.PgyerUtil.checkUpdate(mActivity, false);
}