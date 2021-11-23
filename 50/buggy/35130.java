@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T generateValue() {
    return ((T) (dateFormat.format(dateFunction.generateValue())));
}