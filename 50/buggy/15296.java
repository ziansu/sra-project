@com.github.aesteve.vertx.nubes.annotations.routing.http.GET(value = "/sessionCheck")
public void sessionCheck(io.vertx.ext.web.RoutingContext context) {
    java.lang.String sessionKey = com.nooheat.util.SessionManager.getSessionValueByKey(context.session(), "UserSession");
    java.lang.System.out.println(sessionKey);
}