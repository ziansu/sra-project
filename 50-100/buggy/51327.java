@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    prepareStreamsToUpload();
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        mParents = new java.util.Stack<java.lang.String>();
    }else {
        mParents = ((java.util.Stack<java.lang.String>) (savedInstanceState.getSerializable(com.owncloud.android.ui.activity.Uploader.KEY_PARENTS)));
        mFile = savedInstanceState.getParcelable(com.owncloud.android.ui.activity.Uploader.KEY_FILE);
        mAccountSelected = savedInstanceState.getBoolean(com.owncloud.android.ui.activity.Uploader.KEY_ACCOUNT_SELECTED);
    }
    com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setIcon(com.owncloud.android.utils.DisplayUtils.getSeasonalIconId());
}