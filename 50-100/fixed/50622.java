static java.lang.String selector(com.google.gcloud.bigquery.BigQuery.DatasetField... fields) {
    java.util.Set<java.lang.String> fieldStrings = com.google.common.collect.Sets.newHashSetWithExpectedSize(((fields.length) + 1));
    fieldStrings.add(com.google.gcloud.bigquery.BigQuery.DatasetField.DATASET_REFERENCE.selector());
    for (com.google.gcloud.bigquery.BigQuery.DatasetField field : fields) {
        fieldStrings.add(field.selector());
    }
    return com.google.common.base.Joiner.on(',').join(fieldStrings);
}