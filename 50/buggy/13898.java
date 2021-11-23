public static boolean updateTrue(java.util.List<java.lang.String> keys) {
    for (java.lang.String key : keys) {
        if (key.equals("$set")) {
            return true;
        }
    }
    return false;
}