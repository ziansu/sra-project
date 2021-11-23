@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    java.lang.String url = cn.ieclipse.pay.wxpay.Wxpay.UNIFIED_ORDER_URL;
    java.lang.String body = getRequest(this.params, false);
    if (cn.ieclipse.pay.wxpay.Wxpay.DEBUG) {
        cn.ieclipse.pay.wxpay.Wxpay.log(("\u4e0b\u5355\u8bf7\u6c42xml\u4e3a\uff1a\n" + body));
    }
    java.lang.String content = getResponse(url, body);
    if (cn.ieclipse.pay.wxpay.Wxpay.DEBUG) {
        cn.ieclipse.pay.wxpay.Wxpay.log(("\u4e0b\u5355\u54cd\u5e94xml\u4e3a\uff1a\n" + content));
    }
    req = cn.ieclipse.pay.wxpay.OrderInfoUtil.getPayReq(content);
    return null;
}