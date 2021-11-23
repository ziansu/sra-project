@com.facebook.presto.operator.scalar.ScalarFunction(value = "dayOfWeek")
@com.facebook.presto.operator.Description(value = "Returns the day of week from a date string")
@com.facebook.presto.type.SqlType(value = com.facebook.presto.spi.type.StandardTypes.INTEGER)
public static long dayOfWeek(@com.facebook.presto.type.SqlType(value = com.facebook.presto.spi.type.StandardTypes.VARCHAR)
io.airlift.slice.Slice string) {
    if (string == null) {
        return -1;
    }
    try {
        org.joda.time.LocalDate date = org.joda.time.LocalDate.parse(string.toStringUtf8(), cc.shanruifeng.functions.udfs.scalar.date.DayOfWeekFunction.DEFAULT_DATE_FORMATTER);
        return date.getDayOfWeek();
    } catch (java.lang.Exception e) {
        return -1;
    }
}