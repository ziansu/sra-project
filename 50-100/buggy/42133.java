public static <T> java.util.List<T> parseArray(java.lang.String json, java.lang.Class<T> cls) {
    java.util.List<T> t = null;
    try {
        t = com.alibaba.fastjson.JSON.parseArray(json, cls);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return t;
}