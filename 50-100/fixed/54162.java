public java.lang.String build() {
    java.lang.String fields = fieldsBuilder.toString().trim();
    java.lang.String values = valuesBuilder.toString().trim();
    java.lang.String query = INSERT_TEMPLATE;
    query = query.replace("{TABLE}", table);
    query = query.replace("{FIELDS}", fields);
    query = query.replace("{VALUES}", values);
    return query;
}