protected java.util.HashMap<java.lang.String, java.lang.Object> getCachePageData() {
    java.util.HashMap<java.lang.String, java.lang.Object> data = ((java.util.HashMap<java.lang.String, java.lang.Object>) (cache.getAsObject(getClass().getSimpleName())));
    if (data == null) {
        android.util.Log.e("警告", "没有拿到缓存数据，返回空值");
        return new java.util.HashMap<>();
    }
    return data;
}