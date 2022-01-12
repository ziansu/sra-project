public static java.util.List<java.lang.Object> produceRequests() {
    java.util.List<java.lang.Object> queue = new java.util.ArrayList<java.lang.Object>();
    queue.add(new ml.dmlc.xgboost4j.java.pattern.command.JavaPeople());
    queue.add(new ml.dmlc.xgboost4j.java.pattern.command.PhpPeople());
    queue.add(new ml.dmlc.xgboost4j.java.pattern.command.ScalaPeople());
    return queue;
}