public com.lucidworks.spark.StructType getQuerySchema(org.apache.solr.client.solrj.SolrQuery query) throws java.lang.Exception {
    java.lang.String fieldList = query.getFields();
    if ((fieldList != null) && (!(fieldList.isEmpty()))) {
        return com.lucidworks.spark.SolrRDD.deriveQuerySchema(fieldList.split(","), schema);
    }
    return schema;
}