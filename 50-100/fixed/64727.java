public static boolean testObjectExists(android.content.Context context, java.lang.String key) {
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
    return exists;
}