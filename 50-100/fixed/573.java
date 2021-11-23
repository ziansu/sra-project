@java.lang.Override
public boolean before(com.blade.mvc.hook.Signature signature) {
    com.blade.mvc.http.Response response = signature.getResponse();
    com.blade.mvc.http.Request request = signature.request();
    ning.zhou.bean.login.User user = request.session().attribute(ning.zhou.controller.BaseController.USER);
    java.lang.System.out.print(user);
    if ((ning.zhou.common.hooks.NeedLoginWebHook.needLoginPath.contains(request.uri())) && (null == user)) {
        response.redirect("/");
        return false;
    }
    return true;
}