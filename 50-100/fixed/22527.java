static java.lang.String selector(com.google.gcloud.bigquery.BigQuery.TableField... fields) {
    java.util.Set<java.lang.String> fieldStrings = com.google.common.collect.Sets.newHashSetWithExpectedSize(((fields.length) + 2));
    fieldStrings.add(com.google.gcloud.bigquery.BigQuery.TableField.TABLE_REFERENCE.selector());
    fieldStrings.add(com.google.gcloud.bigquery.BigQuery.TableField.TYPE.selector());
    for (com.google.gcloud.bigquery.BigQuery.TableField field : fields) {
        fieldStrings.add(field.selector());
    }
    return com.google.common.base.Joiner.on(',').join(fieldStrings);
}