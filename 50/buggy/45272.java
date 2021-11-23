public scala.Tuple2<java.lang.String, java.lang.String> apply(org.apache.spark.sql.Row v1) {
    return new scala.Tuple2<java.lang.String, java.lang.String>(v1.getString(1), v1.getString(2));
}