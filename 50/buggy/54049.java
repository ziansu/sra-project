@java.lang.Override
public net.hydromatic.optiq.jdbc.OptiqSchema getSubSchema(java.lang.String schemaName, boolean caseSensitive) {
    net.hydromatic.optiq.Schema s = schema.getSubSchema(name);
    if (s != null) {
        return new net.hydromatic.optiq.jdbc.SimpleOptiqSchema(this, s, name);
    }
    return subSchemas.get(schemaName);
}