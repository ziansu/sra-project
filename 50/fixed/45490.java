@java.lang.SuppressWarnings(value = "unchecked")
public static final <T> T parseObject(java.lang.String input, java.lang.reflect.Type clazz, com.alibaba.fastjson.parser.deserializer.ParseProcess processor, com.alibaba.fastjson.parser.Feature... features) {
    return ((T) (com.alibaba.fastjson.JSON.parseObject(input, clazz, ParserConfig.global, processor, com.alibaba.fastjson.JSON.DEFAULT_PARSER_FEATURE, features)));
}