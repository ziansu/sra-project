@java.lang.Override
public org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> execute(org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> input_small_patches, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> input_word_patches) throws java.lang.Exception {
    org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> preprocessed = preProcess(input_small_patches);
    org.apache.spark.mllib.linalg.Vector[] features = learnFeatures(preprocessed);
    org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> represent = extractFeatures(input_word_patches, configLayer, features);
    org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> pooled = pool(represent);
    return pooled;
}