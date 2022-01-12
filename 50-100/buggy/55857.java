public java.lang.String syncGetToken(com.yunhetong.sdk.bean.LxUser user) throws com.yunhetong.sdk.LxDecryptException, com.yunhetong.sdk.LxEncryptException, com.yunhetong.sdk.LxKeyException, com.yunhetong.sdk.LxNonsupportException, com.yunhetong.sdk.LxSignatureException, com.yunhetong.sdk.LxVerifyException, java.io.IOException {
    java.lang.String source = com.yunhetong.sdk.LxMessageProvider.msgGetToken(this.appid, user);
    java.lang.String secret = secretManager.encryptWithUTF8(source);
    java.lang.String response = com.yunhetong.sdk.util.LxHttpUtil.post("/third/tokenWithUser", this.appid, secret);
    java.lang.System.out.println(response);
    return secretManager.decryptWithUTF8(response);
}