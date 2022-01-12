public java.util.Map<java.lang.String, java.lang.Object> getAppInfo(java.lang.String appID) throws java.io.IOException {
    java.lang.String jobListString = (uk.ac.ic.spark.monitor.util.SparkRequester.url) + appID;
    java.lang.String body = requestToSpark(jobListString);
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.Object>>() {    }.getType();
    com.google.gson.Gson gson = uk.ac.ic.spark.monitor.util.SparkRequester.gsonBuilder.create();
    java.util.Map<java.lang.String, java.lang.Object> appMap = gson.fromJson(body, type);
    return appMap;
}