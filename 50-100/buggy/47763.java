public Result call(Http.Context ctx) throws java.lang.Throwable {
    controllers.UserApp.initTokenUser();
    controllers.UserApp.updatePreferredLanguage();
    ctx.response().setHeader("Date", org.apache.http.impl.cookie.DateUtils.formatDate(new java.util.Date()));
    ctx.response().setHeader("Cache-Control", "no-cache");
    Result result = delegate.call(ctx);
    utils.AccessLogger.log(request, result, java.lang.System.currentTimeMillis());
    return result;
}