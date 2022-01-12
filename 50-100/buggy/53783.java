public static org.apache.spark.mllib.linalg.Vector loadFromObject(java.lang.String inFile, org.apache.spark.api.java.JavaSparkContext sc) {
    org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> out = sc.objectFile("inFile");
    java.util.List<org.apache.spark.mllib.linalg.Vector> a = out.collect();
    return org.apache.spark.mllib.linalg.Vectors.dense(a.get(0).toArray());
}