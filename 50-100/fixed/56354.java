public java.lang.Object handle(vn.com.vndirect.socialtrading.api.Request request, vn.com.vndirect.socialtrading.api.Response response) throws java.lang.Exception {
    java.lang.String traderId = request.params(":traderid");
    java.lang.String followerId = request.params(":id");
    vn.com.vndirect.socialtrading.dao.LoginDao dao = new vn.com.vndirect.socialtrading.dao.LoginDao();
    dao.unfollowTrader(followerId, traderId);
    response.status(200);
    return "ok";
}