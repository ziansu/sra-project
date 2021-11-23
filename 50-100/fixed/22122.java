private java.lang.String sign(java.lang.String timestamp, java.lang.String nonce, java.lang.String msg) {
    java.lang.String[] verify = new java.lang.String[]{ config.getToken() , timestamp , nonce , msg };
    java.util.Arrays.sort(verify);
    return io.sophone.sdk.wechat.WechatUtils.sha1hex(((((verify[0]) + (verify[1])) + (verify[2])) + (verify[3])));
}