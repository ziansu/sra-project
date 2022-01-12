@java.lang.Override
public void flatMap(org.wikipedia.citolytics.clickstream.types.ClickStreamResult clickStreamResult, org.apache.flink.util.Collector<org.apache.flink.api.java.tuple.Tuple2<java.lang.String, java.lang.Long>> out) throws java.lang.Exception {
    for (org.wikipedia.citolytics.clickstream.types.ClickStreamRecommendationResult r : clickStreamResult.getRecommendations()) {
        out.collect(new org.apache.flink.api.java.tuple.Tuple2(r.getRecommendedArticle(), 1L));
    }
}