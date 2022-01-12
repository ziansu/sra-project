public java.lang.Object handle(vn.com.vndirect.socialtrading.api.Request request, vn.com.vndirect.socialtrading.api.Response response) throws java.lang.Exception, java.sql.SQLException {
    java.lang.String followerId = request.queryParams(":id");
    java.lang.String traderId = request.queryParams("traderid");
    int moneyAllocate = java.lang.Integer.parseInt(request.queryParams("money"));
    int maxOpen = java.lang.Integer.parseInt(request.queryParams("maxopen"));
    vn.com.vndirect.socialtrading.dao.LoginDao dao = new vn.com.vndirect.socialtrading.dao.LoginDao();
    dao.followTrader(followerId, traderId, moneyAllocate, maxOpen);
    response.status(200);
    return "ok";
}