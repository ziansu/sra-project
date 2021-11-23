protected java.lang.String toQueryString(java.util.List<java.lang.String> paramNames) {
    com.github.cuter44.wxpay.reqs.URLBuilder ub = new com.github.cuter44.wxpay.reqs.URLBuilder();
    for (java.lang.String key : paramNames)
        if (!(com.github.cuter44.wxpay.reqs.WxpayRequestBase.KEY_SIGN.equals(key)))
            ub.appendParam(key, this.getProperty(key));
        
    
    return ub.toString();
}