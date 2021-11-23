java.lang.Object innerInvoke(java.lang.Class<? extends java.lang.annotation.Annotation> annotation, java.lang.Object... params) {
    java.lang.reflect.Method method = eventMethodMap.get(annotation);
    if (((obj.get()) == null) || (method == null)) {
        return null;
    }
    return com.wq.android.lightannotation.LightBinder.invoke(method, obj.get(), params);
}