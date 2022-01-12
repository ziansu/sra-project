@java.lang.Override
public void serialize(@android.support.annotation.Nullable
final org.joda.time.DateTime object, @android.support.annotation.Nullable
final java.lang.String fieldName, final boolean writeFieldNameForObject, @android.support.annotation.NonNull
final com.fasterxml.jackson.core.JsonGenerator jsonGenerator) throws java.io.IOException {
    if (fieldName != null) {
        jsonGenerator.writeStringField(fieldName, (object != null ? object.toString() : null));
    }else {
        jsonGenerator.writeString((object != null ? object.toString() : null));
    }
}