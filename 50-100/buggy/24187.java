public java.lang.Object getCoupon(java.lang.String utoken, int couponId) {
    cn.momia.common.core.http.MomiaHttpParamBuilder builder = new cn.momia.common.core.http.MomiaHttpParamBuilder().add("utoken", utoken).add("coupon", couponId);
    return executeReturnObject(cn.momia.common.core.http.MomiaHttpRequestBuilder.POST("/activity/coupon", builder.build()), java.lang.Object.class);
}