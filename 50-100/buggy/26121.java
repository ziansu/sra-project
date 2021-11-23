@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (BuildConfig.DEBUG) {
        timber.log.Timber.plant(new timber.log.Timber.DebugTree());
    }
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