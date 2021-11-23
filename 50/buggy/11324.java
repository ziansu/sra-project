@java.lang.Override
public java.lang.String validateValue(java.lang.String value) {
    java.lang.String newValue = null;
    if (value != null) {
        newValue = value.trim();
    }
    return newValue;
}