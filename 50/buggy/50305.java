public static void main(java.lang.String[] args) {
    util.RequestUtil requestUtil = new util.RequestUtil();
    requestUtil.receiveAccessToken();
    java.lang.System.out.println(requestUtil.makeRequest("/api/v1/json/categories", null, "GET"));
}