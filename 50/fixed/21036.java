@java.lang.Override
protected boolean persistString(java.lang.String value) {
    return (value != null) && (persistInt(java.lang.Integer.valueOf(value)));
}