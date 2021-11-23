public void processContacts(long userId, java.lang.String mobile, java.lang.String name) {
    cn.momia.api.base.http.MomiaHttpParamBuilder builder = new cn.momia.api.base.http.MomiaHttpParamBuilder().add("mobile", mobile).add("name", name);
    cn.momia.api.base.http.MomiaHttpRequest request = cn.momia.api.base.http.MomiaHttpRequest.POST(url((("user" + userId) + "contacts")), builder.build());
    executeRequest(request);
}