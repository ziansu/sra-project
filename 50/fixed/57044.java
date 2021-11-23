@java.lang.Override
public java.lang.Object getParameter(java.lang.String name) {
    java.lang.Object value = super.getParameter(name);
    if (value != null) {
        return value;
    }
    return getAttributeValue(name);
}