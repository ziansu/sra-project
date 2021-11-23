public static play.mvc.Result getProjectList() throws org.ats.component.usersmgt.UserManagementException {
    java.lang.String type = request().getQueryString("type");
    java.lang.String group_id = request().getQueryString("group");
    java.lang.String userText = request().getQueryString("user");
    return ok(controllers.test.TestController.getProjectListHtml(type.toString(), group_id, userText, 1));
}