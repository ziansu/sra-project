public static final java.lang.String toJSONString(java.lang.Object object, com.alibaba.fastjson.serializer.SerializeFilter[] filters, com.alibaba.fastjson.serializer.SerializerFeature... features) {
    com.alibaba.fastjson.serializer.SerializeWriter out = new com.alibaba.fastjson.serializer.SerializeWriter(((java.io.Writer) (null)), com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE, features);
    try {
        com.alibaba.fastjson.serializer.JSONSerializer serializer = new com.alibaba.fastjson.serializer.JSONSerializer(out, com.alibaba.fastjson.serializer.SerializeConfig.globalInstance);
        serializer.out.config(SerializerFeature.WriteDateUseDateFormat, true);
        com.alibaba.fastjson.JSON.setFilter(serializer, filters);
        serializer.write(object);
        return out.toString();
    } finally {
        out.close();
    }
}