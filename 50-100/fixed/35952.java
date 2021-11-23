protected java.lang.String toQueryString(java.util.List<java.lang.String> paramNames) {
    com.github.cuter44.wxpay.reqs.URLBuilder ub = new com.github.cuter44.wxpay.reqs.URLBuilder();
    for (java.lang.String key : paramNames) {
        if (com.github.cuter44.wxpay.reqs.WxpayRequestBase.KEY_SIGN.equals(key))
            continue;
        
        java.lang.String value = this.getProperty(key);
        if ((value == null) || (value.isEmpty()))
            continue;
        
        ub.appendParam(key, value);
    }
    return ub.toString();
}