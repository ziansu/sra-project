public void call(scala.Tuple2<java.lang.String, java.util.Vector> stringVectorTuple2) throws java.lang.Exception {
    java.lang.String value = stringVectorTuple2._2().toString();
    if (value == null)
        value = "";
    
    org.apache.spark.api.java.JavaRDD<java.lang.String> testerValue = edu.sehir.testo.stream.TestAnalysisStreamWithKafka.jsc.parallelize(java.util.Arrays.asList(value));
    testerValue.saveAsTextFile(edu.sehir.testo.common.Path.getPath(Globals.HDFS_PROCESSED_FILE_DIR, stringVectorTuple2._1(), Globals.TEST_FILE_NAME_FORMAT.format(new java.util.Date())));
}