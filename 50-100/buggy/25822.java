public static java.util.List<scala.Tuple2<java.lang.Double, java.lang.String>> GetTopNNodes(org.apache.spark.api.java.JavaPairRDD<java.lang.String, java.lang.Double> pairedrdd, int NImportantNodes) {
    return pairedrdd.mapToPair(new org.apache.spark.api.java.function.PairFunction<scala.Tuple2<java.lang.String, java.lang.Double>, java.lang.Double, java.lang.String>() {
        @java.lang.Override
        public scala.Tuple2<java.lang.Double, java.lang.String> call(scala.Tuple2<java.lang.String, java.lang.Double> arg0) throws java.lang.Exception {
            return new scala.Tuple2(arg0._2, arg0._1);
        }
    }).cache().sortByKey().take(NImportantNodes);
}