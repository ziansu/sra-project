private java.lang.reflect.Field getIdField(java.lang.Class<?> type) {
    if (type.equals(com.SearingMedia.proactiveandroid.Model.class)) {
        try {
            return type.getDeclaredField("id");
        } catch (java.lang.NoSuchFieldException e) {
            android.util.Log.e("Impossible!", e.toString());
        }
    }else
        if ((type.getSuperclass()) != null) {
            return getIdField(type.getSuperclass());
        }
    
    return null;
}