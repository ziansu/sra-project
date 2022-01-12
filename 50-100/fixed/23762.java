private boolean verify(final java.lang.String signature, java.lang.String timestamp, final java.lang.String nonce) {
    java.lang.String[] verify = new java.lang.String[]{ config.getToken() , timestamp , nonce };
    java.util.Arrays.sort(verify);
    return signature.equals(io.sophone.sdk.wechat.WechatUtils.sha1hex((((verify[0]) + (verify[1])) + (verify[2]))));
}