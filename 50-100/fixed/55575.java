public static java.lang.String toJSONString(java.lang.Object object, com.alibaba.fastjson.serializer.SerializeFilter[] filters, com.alibaba.fastjson.serializer.SerializerFeature... features) {
    com.alibaba.fastjson.serializer.SerializeWriter out = new com.alibaba.fastjson.serializer.SerializeWriter();
    try {
        com.alibaba.fastjson.serializer.JSONSerializer serializer = new com.alibaba.fastjson.serializer.JSONSerializer(out);
        for (com.alibaba.fastjson.serializer.SerializerFeature feature : features) {
            serializer.config(feature, true);
        }
        com.alibaba.fastjson.JSON.setFilter(serializer, filters);
        serializer.write(object);
        return out.toString();
    } finally {
        out.close();
    }
}