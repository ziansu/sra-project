@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mUm = ((android.os.UserManager) (getSystemService(Context.USER_SERVICE)));
    mProfiles = new android.util.SparseArray<com.android.settings.accounts.AccountSettings.ProfileData>(2);
    setHasOptionsMenu(true);
}