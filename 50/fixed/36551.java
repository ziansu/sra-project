@java.lang.Override
public void setAllowedValues(java.util.List<java.lang.String> values) {
    allowedValues = values;
    if (((allowedValues) != null) && (!(allowedValues.isEmpty()))) {
        setValue(allowedValues.get(0));
    }
}