@java.lang.Override
public void flatMap(org.wikipedia.citolytics.clickstream.types.ClickStreamResult r, org.apache.flink.util.Collector<org.apache.flink.api.java.tuple.Tuple2<java.lang.String, java.lang.Integer>> out) throws java.lang.Exception {
    if ((r.getRecommendationsCount()) > 0) {
        out.collect(new org.apache.flink.api.java.tuple.Tuple2(r.getRecommendations().get(0).getRecommendedArticle(), 1));
    }
}