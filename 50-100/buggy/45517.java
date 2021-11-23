@java.lang.Override
protected void afterHookedMethod(hook.xposed.MethodHookParam param) {
    java.lang.String url = param.thisObject.toString();
    if (!(url.contains("http:"))) {
        return ;
    }
    java.net.HttpURLConnection connection = ((java.net.HttpURLConnection) (param.getResult()));
    java.lang.String jsonUrl = handleUrl(url);
    util.Util.writeLog(packageParam.packageName, jsonUrl);
    java.lang.String jsonResult = handleResult(connection);
    if (!(jsonResult.equals(""))) {
        util.Util.writeLog(packageParam.packageName, jsonUrl);
    }
}