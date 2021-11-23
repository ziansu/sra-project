private boolean verify(final java.lang.String signature, int timestamp, final java.lang.String nonce) {
    java.lang.String[] verify = new java.lang.String[]{ config.getToken() , java.lang.String.valueOf(timestamp) , nonce };
    java.util.Arrays.sort(verify);
    return signature.equals(io.sophone.sdk.wechat.WechatUtils.sha1hex((((verify[0]) + (verify[1])) + (verify[2]))));
}