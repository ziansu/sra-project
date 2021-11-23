private java.lang.Object getFieldValue(final java.lang.String fieldName) {
    try {
        final java.lang.reflect.Field f = android.widget.NumberPicker.class.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(this);
    } catch (java.lang.NoSuchFieldException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
    return null;
}