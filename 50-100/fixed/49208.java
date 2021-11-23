public static <T> java.util.List<T> parseArray(java.lang.String json, java.lang.Class<T> cls) {
    java.util.List<T> t;
    try {
        t = com.alibaba.fastjson.JSON.parseArray(json, cls);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        t = new java.util.ArrayList<T>(0);
    }
    return t;
}