@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    prepareStreamsToUpload();
    if (savedInstanceState == null) {
        mParents = new java.util.Stack<java.lang.String>();
        mAccountSelected = false;
    }else {
        mParents = ((java.util.Stack<java.lang.String>) (savedInstanceState.getSerializable(com.owncloud.android.ui.activity.Uploader.KEY_PARENTS)));
        mFile = savedInstanceState.getParcelable(com.owncloud.android.ui.activity.Uploader.KEY_FILE);
        mAccountSelected = savedInstanceState.getBoolean(com.owncloud.android.ui.activity.Uploader.KEY_ACCOUNT_SELECTED);
    }
    super.onCreate(savedInstanceState);
    com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setIcon(com.owncloud.android.utils.DisplayUtils.getSeasonalIconId());
}