@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T generateValue() {
    java.util.Calendar date = dateFunction.generateValue();
    return ((T) (dateFormat.format(date.getTime())));
}