@java.lang.Override
public void onCreate() {
    super.onCreate();
    me.sheimi.sgit.SGitApplication.mContext = getApplicationContext();
    setAppVersionPref();
    mPrefsHelper = new me.sheimi.sgit.preference.PreferenceHelper(this);
    try {
        mSecPrefs = new me.sheimi.android.utils.SecurePrefsHelper(this);
        me.sheimi.sgit.SGitApplication.mCredentialsProvider = new me.sheimi.sgit.AndroidJschCredentialsProvider(mSecPrefs);
    } catch (me.sheimi.android.utils.SecurePrefsException e) {
        timber.log.Timber.e(e);
    }
}