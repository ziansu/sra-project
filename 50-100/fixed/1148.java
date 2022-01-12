private static boolean isArray(com.google.firebase.database.MutableData mutableData) {
    long expectedKey = -1;
    for (com.google.firebase.database.MutableData child : mutableData.getChildren()) {
        try {
            long key = java.lang.Long.parseLong(child.getKey());
            if (key > expectedKey) {
                expectedKey++;
            }else {
                return false;
            }
        } catch (java.lang.NumberFormatException ex) {
            return false;
        }
    }
    return true;
}