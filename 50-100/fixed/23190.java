public static synchronized void init(android.content.Context context) {
    if ((BaseRealm.applicationContext) == null) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Non-null context required.");
        }
        io.realm.internal.RealmCore.loadLibrary(context);
        io.realm.log.RealmLog.add((com.getkeepsafe.relinker.BuildConfig.DEBUG ? new io.realm.log.AndroidLogger(android.util.Log.DEBUG) : new io.realm.log.AndroidLogger(android.util.Log.WARN)));
        io.realm.Realm.defaultConfiguration = new io.realm.RealmConfiguration.Builder(context).build();
        BaseRealm.applicationContext = context.getApplicationContext();
    }
}