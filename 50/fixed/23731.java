public static <T extends java.lang.Object> T getCastData(java.lang.String key, android.os.Bundle dataStore) {
    return ((T) (dataStore.get(key)));
}