@java.lang.SuppressWarnings(value = "unchecked")
public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser parser, java.lang.reflect.Type type, java.lang.Object fieldName) {
    java.util.Date date = DateDeserializer.instance.deserialze(parser, type, fieldName);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(date);
    return ((T) (calendar));
}