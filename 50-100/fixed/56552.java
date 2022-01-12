@java.lang.SuppressWarnings(value = "rawtypes")
public void checkMapResolve(java.util.Map object, java.lang.Object fieldName) {
    if ((resolveStatus) == (com.alibaba.fastjson.parser.DefaultJSONParser.NeedToResolve)) {
        com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer fieldResolver = new com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer(object, fieldName);
        com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask task = getLastResolveTask();
        task.fieldDeserializer = fieldResolver;
        task.ownerContext = context;
        setResolveStatus(com.alibaba.fastjson.parser.DefaultJSONParser.NONE);
    }
}