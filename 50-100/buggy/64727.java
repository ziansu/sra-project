public static boolean testObjectExists(android.content.Context context, java.lang.String key) {
    android.util.Log.d(com.pea.jay.redditlists.persistance.InternalStorage.TAG, "Testign object exists");
    boolean exists = true;
    try {
        com.pea.jay.redditlists.persistance.InternalStorage.readObject(context, key);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        exists = false;
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
        exists = false;
    }
    android.util.Log.d(com.pea.jay.redditlists.persistance.InternalStorage.TAG, ("Testign object exists  = " + exists));
    return exists;
}