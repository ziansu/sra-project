@java.lang.Override
public void handle(io.vertx.ext.web.RoutingContext ctx) {
    java.lang.String clientId = com.planb.support.user.UserManager.getEncryptedIdFromSession(ctx);
    java.lang.String dst = ctx.request().getFormAttribute("dst");
    java.lang.String topic = ctx.request().getFormAttribute("topic");
    com.planb.support.utilities.MySQL.executeUpdate("DELETE FROM travel_clients WHERE topic=? AND client_id=?", topic, dst);
    com.planb.support.utilities.MySQL.executeUpdate("INSERT INTO travel_clients VALUES(?, ?)", topic, clientId);
    ctx.response().setStatusCode(201).end();
    ctx.response().close();
}