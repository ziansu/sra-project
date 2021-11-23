@android.support.annotation.Nullable
@java.lang.Override
public org.joda.time.DateTime parse(@android.support.annotation.NonNull
final com.fasterxml.jackson.core.JsonParser jsonParser) throws java.io.IOException {
    final java.lang.String dateString = jsonParser.getValueAsString();
    if (dateString == null) {
        return null;
    }
    try {
        return org.joda.time.DateTime.parse(dateString);
    } catch (final java.lang.RuntimeException exception) {
        ru.touchin.roboswag.core.log.Lc.assertion(exception);
    }
    return null;
}