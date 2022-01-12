public ir.rasen.charsoo.controller.helper.ServerAnswer executeList(android.content.Context context) throws java.lang.Exception {
    if (!(ir.rasen.charsoo.controller.helper.NetworkHandler.isNetworkAvailable(context)))
        return ir.rasen.charsoo.controller.helper.WebservicesHandler.getNetworkConnectionError();
    
    org.apache.http.HttpResponse httpResponse = null;
    try {
        httpResponse = httpclient.execute(httpGet);
    } catch (java.lang.Exception e) {
    }
    return ir.rasen.charsoo.controller.helper.ServerAnswer.getList(httpResponse);
}