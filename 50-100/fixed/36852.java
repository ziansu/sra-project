private static java.lang.Object invokeMethod(final java.lang.Object obj, final java.lang.String methodName) {
    final java.lang.Class<? extends java.lang.Object> cls = obj.getClass();
    try {
        final java.lang.reflect.Method method = cls.getMethod(methodName);
        java.lang.Object ret = method.invoke(obj);
        return ret;
    } catch (final java.lang.Exception e) {
        android.util.Log.e(com.koodroid.chicken.ARHelper.TAG, "Error invoking method:", e);
    }
    return null;
}