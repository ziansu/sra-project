public static boolean setupArrayList(android.content.Context context) {
    android.util.Log.d(com.pea.jay.redditlists.persistance.InternalStorage.TAG, "setting up array list");
    if (!(com.pea.jay.redditlists.persistance.InternalStorage.testObjectExists(context, com.pea.jay.redditlists.persistance.InternalStorage.IDs))) {
        try {
            android.util.Log.d(com.pea.jay.redditlists.persistance.InternalStorage.TAG, "creating list IDs");
            com.pea.jay.redditlists.persistance.InternalStorage.writeObject(context, com.pea.jay.redditlists.persistance.InternalStorage.IDs, com.pea.jay.redditlists.persistance.InternalStorage.redditListIDS);
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
            return false;
        }
    }
    return true;
}