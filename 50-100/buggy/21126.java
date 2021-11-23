public cn.momia.api.user.Contacts getContacts(java.lang.String utoken) {
    cn.momia.api.base.http.MomiaHttpParamBuilder builder = new cn.momia.api.base.http.MomiaHttpParamBuilder().add("utoken", utoken);
    cn.momia.api.base.http.MomiaHttpRequest request = cn.momia.api.base.http.MomiaHttpRequest.GET("contacts", true, url("user/contacts"), builder.build());
    return com.alibaba.fastjson.JSON.toJavaObject(((com.alibaba.fastjson.JSON) (executeRequest(request))), cn.momia.api.user.Contacts.class);
}