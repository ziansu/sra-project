private static java.lang.Object getField(final java.lang.Object obj, final java.lang.String fieldName) {
    try {
        java.lang.reflect.Field f = obj.getClass().getField(fieldName);
        return f.get(obj);
    } catch (final java.lang.Exception e) {
        android.util.Log.e(com.koodroid.chicken.ARHelper.TAG, "Error getting field:", e);
    }
    return null;
}