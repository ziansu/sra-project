public void loadDrawables(java.lang.Class<?> clz) {
    final java.lang.reflect.Field[] fields = clz.getDeclaredFields();
    for (java.lang.reflect.Field field : fields) {
        final int drawableId;
        try {
            drawableId = field.getInt(clz);
            imageList.put(drawableId, android.graphics.BitmapFactory.decodeResource(context.getResources(), drawableId));
        } catch (java.lang.Exception e) {
            continue;
        }
    }
}