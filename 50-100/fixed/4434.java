protected static void replaceFont(java.lang.String staticTypefaceFieldName, final android.graphics.Typeface newTypeface) {
    try {
        final java.lang.reflect.Field staticField = android.graphics.Typeface.class.getDeclaredField(staticTypefaceFieldName);
        staticField.setAccessible(true);
        staticField.set(null, newTypeface);
    } catch (java.lang.NoSuchFieldException | java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
}