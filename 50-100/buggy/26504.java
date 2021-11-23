public org.apache.spark.sql.DataFrame applySchema(org.apache.spark.sql.SQLContext sqlContext, org.apache.solr.client.solrj.SolrQuery query, org.apache.spark.api.java.JavaRDD<org.apache.solr.common.SolrDocument> docs) throws java.lang.Exception {
    com.lucidworks.spark.StructType schema = com.lucidworks.spark.SolrRDD.getQuerySchema(query, getSchema());
    org.apache.spark.api.java.JavaRDD<org.apache.spark.sql.Row> rows = toRows(schema, docs);
    return sqlContext.applySchema(rows, schema);
}