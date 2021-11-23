@java.lang.Override
public void handling() {
    java.lang.String pid = req.getParam("projectid");
    context.put("pid", 1);
    java.lang.System.out.println((pid + "##################"));
    context.put("name", session.get("name"));
    io.vertx.core.json.JsonArray params = org.webdroid.util.JsonUtil.createJsonArray(((java.lang.Integer) (session.get("id"))));
    rendering(templateEngine, ((WebdroidConstant.Path.HTML) + "/projectview"));
}