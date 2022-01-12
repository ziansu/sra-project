public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getStagesList(java.lang.String appID) throws java.io.IOException {
    java.lang.String jobListString = ((url) + appID) + "/stages";
    java.lang.String body = requestToSpark(jobListString);
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<java.util.Map<java.lang.String, java.lang.Object>>>() {    }.getType();
    com.google.gson.Gson gson = uk.ac.ic.spark.monitor.util.SparkRequester.gsonBuilder.create();
    java.util.List<java.util.Map<java.lang.String, java.lang.Object>> jobList = gson.fromJson(body, type);
    return jobList;
}