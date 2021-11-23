@java.lang.Override
public nl.renarj.jasdb.api.properties.Property addValue(nl.renarj.jasdb.api.properties.Value value) {
    values.add(value);
    validateAndSetCollection();
    return this;
}