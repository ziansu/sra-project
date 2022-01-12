@java.lang.Override
public void runUpdate(org.apache.spark.api.java.JavaSparkContext sparkContext, long timestamp, org.apache.spark.api.java.JavaPairRDD<K, M> newData, org.apache.spark.api.java.JavaPairRDD<K, M> pastData, java.lang.String modelDirString, com.cloudera.oryx.api.TopicProducer<java.lang.String, U> modelUpdateTopic) {
    scalaUpdate.configureUpdate(sparkContext.sc(), timestamp, newData.rdd(), (pastData == null ? null : pastData.rdd()), modelDirString, modelUpdateTopic);
}