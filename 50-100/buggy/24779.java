@java.lang.Override
public org.joda.time.LocalDateTime read(java.lang.Object jsonValue, com.effektif.workflow.impl.json.JsonReader jsonReader) {
    if (!(java.util.Date.class.isAssignableFrom(jsonValue.getClass()))) {
        throw new com.effektif.workflow.impl.data.InvalidValueException(java.lang.String.format("Invalid date ā%sā (%s)", jsonValue, jsonValue.getClass().getName()));
    }
    return new org.joda.time.LocalDateTime(((java.util.Date) (jsonValue)), org.joda.time.DateTimeZone.getDefault());
}