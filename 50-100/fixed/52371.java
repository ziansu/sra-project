public static play.mvc.Result appConfig() {
    com.fasterxml.jackson.databind.node.ObjectNode response = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode config = play.libs.Json.newObject();
    config.put("appVersion", controllers.Application.APP_VERSION);
    config.put("isInternal", controllers.Application.IS_INTERNAL);
    config.set("tracking", controllers.Application.trackingInfo());
    response.put("status", "ok");
    response.set("config", config);
    return ok(response);
}