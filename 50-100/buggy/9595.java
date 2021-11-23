@java.lang.Override
public void onRequest() {
    org.apache.wicket.request.cycle.RequestCycle requestCycle = org.apache.wicket.request.cycle.RequestCycle.get();
    com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
    final com.google.gson.Gson gson = new com.google.gson.GsonBuilder().create();
    final java.lang.String fieldJson = this.getModelAsJson();
    requestCycle.scheduleRequestHandlerAfterCurrent(new org.apache.wicket.request.handler.TextRequestHandler("application/json", "UTF-8", ""));
}