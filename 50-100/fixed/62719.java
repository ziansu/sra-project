public com.alibaba.fastjson.JSONObject parseObject() {
    com.alibaba.fastjson.JSONObject object = (((lexer.features) & (Feature.OrderedField.mask)) != 0) ? new com.alibaba.fastjson.JSONObject(new java.util.LinkedHashMap<java.lang.String, java.lang.Object>()) : new com.alibaba.fastjson.JSONObject();
    return ((com.alibaba.fastjson.JSONObject) (parseObject(object, null)));
}