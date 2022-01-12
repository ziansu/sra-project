public void add(final java.lang.String key, final de.dentrassi.kapua.dataproxy.FieldHandler handler, final java.lang.String value) throws java.lang.Exception {
    handler.handle(key, value, payload);
}