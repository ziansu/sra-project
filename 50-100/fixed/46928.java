@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.String getValue() {
    errors = null;
    com.mokadevel.renew.forms.Collector collector = com.mokadevel.renew.forms.Form.FormField.collectors.get(source.getClass());
    if (collector == null) {
        throw new com.mokadevel.renew.forms.InvalidSourceTypeException(("No collector for the type " + (source.getClass().getCanonicalName())));
    }
    return collector.collect(source);
}