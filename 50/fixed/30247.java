@java.lang.Override
public void update(final org.vertx.java.core.json.JsonObject resource, final org.entcore.common.user.UserInfos user, final org.vertx.java.core.Handler<fr.wseduc.webutils.Either<java.lang.String, org.vertx.java.core.json.JsonObject>> handler) {
    org.vertx.java.core.json.JsonObject grainData = new org.vertx.java.core.json.JsonObject();
    super.update(resource, user, handler);
}