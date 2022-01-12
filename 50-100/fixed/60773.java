private static void log(int level, java.lang.String tag, java.lang.String msg, boolean firebase) {
    if (!(tr.name.fatihdogan.books.BuildConfig.DEBUG))
        return ;
    
    if (firebase)
        com.google.firebase.crash.FirebaseCrash.logcat(level, tag, msg);
    else
        android.util.Log.println(level, tag, msg);
    
}