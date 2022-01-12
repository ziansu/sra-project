@com.blade.mvc.annotation.Route(value = "/", method = com.blade.mvc.http.HttpMethod.GET)
public java.lang.String index(com.blade.mvc.http.Request request) {
    java.lang.String webRoot = com.tale.controller.admin.AttachController.CLASSPATH;
    boolean existInstall = com.blade.kit.FileKit.exist((webRoot + "install.lock"));
    if (existInstall) {
        if ("1".equals(TaleConst.OPTIONS.get("allow_install", "0"))) {
            request.attribute("is_install", false);
        }else {
            request.attribute("is_install", true);
        }
    }else {
        request.attribute("is_install", false);
    }
    return "install";
}