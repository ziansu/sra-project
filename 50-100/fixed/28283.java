@controllers.Security.Authenticated(value = controllers.UserAuth.class)
public play.mvc.Result createTool() {
    models.Tools tool = play.data.Form.form(models.Tools.class).bindFromRequest().get();
    tool.user = Users.find.byId(java.lang.Long.parseLong(session().get("user_id")));
    tool.save();
    Users.find.byId(java.lang.Long.parseLong(session().get("user_id"))).tool.add(tool);
    return redirect(routes.Application.index());
}