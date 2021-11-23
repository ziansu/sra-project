@java.lang.Override
public java.lang.String stringValue() {
    return ((uri) == null) || (uri.isEmpty()) ? localName : (('{' + (uri)) + '}') + (localName);
}