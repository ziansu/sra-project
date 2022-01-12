public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getAppsList() throws java.io.IOException {
    java.lang.String appListString = uk.ac.ic.spark.monitor.util.SparkRequester.url;
    java.lang.String body = requestToSpark(appListString);
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>() {    }.getType();
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> jobList = gson.fromJson(body, type);
    return jobList;
}