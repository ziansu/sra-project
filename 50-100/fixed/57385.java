protected boolean verifySign(java.util.List<java.lang.String> paramNames, java.util.Properties conf) throws java.io.UnsupportedEncodingException {
    this.respProp = com.github.cuter44.wxpay.resps.WxpayResponseBase.buildConf(this.respProp, conf);
    java.lang.String stated = this.getProperty("sign");
    java.lang.String calculated = this.sign(paramNames);
    return (stated != null) && (stated.equals(calculated));
}