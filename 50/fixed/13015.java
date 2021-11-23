public static boolean contains(java.util.ArrayList<com.google.firebase.database.DataSnapshot> aList, java.lang.String key) {
    for (com.google.firebase.database.DataSnapshot dataSnapshot : aList) {
        if (dataSnapshot.getKey().equals(key))
            return true;
        
    }
    return false;
}