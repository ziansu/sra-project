public static void set(java.lang.Object rootObject, java.lang.String path, java.lang.Object value) {
    com.alibaba.fastjson.JSONPath jsonpath = com.alibaba.fastjson.JSONPath.compile(path);
    jsonpath.set(rootObject, value);
}