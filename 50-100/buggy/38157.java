public static play.mvc.Result login() {
    com.feth.play.module.pa.controllers.Authenticate.noCache(response());
    if (controllers.UserApp.useSocialLoginOnly) {
        flash(controllers.UserApp.FLASH_ERROR_KEY, play.i18n.Messages.get("app.warn.support.social.login.only"));
        return controllers.Application.index();
    }
    if (controllers.HttpUtil.isJSONPreferred(request())) {
        return controllers.UserApp.loginByAjaxRequest();
    }else {
        play.Logger.error("---- hre");
        return controllers.UserApp.loginByFormRequest();
    }
}