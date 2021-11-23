@java.lang.Override
public void process(org.apache.camel.Exchange exchange) throws java.lang.Exception {
    java.lang.System.out.println("TEST");
    java.lang.String json = exchange.getIn().getBody(java.lang.String.class);
    com.workflow2015.common.helper.RouteRequest routeRequest = JsonHelper.gson.fromJson(json, com.workflow2015.common.helper.RouteRequest.class);
    java.lang.String data = this.getDataFromSource(routeRequest);
    this.pushDataToQueue(data);
}