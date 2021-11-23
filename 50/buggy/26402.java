public int getCouponFee() {
    java.lang.String sCouponFee = this.getProperty(com.github.cuter44.wxpay.resps.OrderQueryResponse.KEY_COUPON_FEE);
    if (this.getProperty((sCouponFee != null)))
        return java.lang.Integer.valueOf(sCouponFee);
    
    return 0;
}