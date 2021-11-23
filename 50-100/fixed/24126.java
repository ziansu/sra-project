public void postMessage(java.lang.String url, java.lang.String secret, java.lang.String hmac, java.lang.String contentType, java.lang.String content) {
    java.lang.String signature = br.com.minone.webhooks.security.SignatureService.newInstance(HmacAlgorithm.HMAC_SHA1).calculateHMAC(secret, content);
    if (!(signature.equals(hmac))) {
        throw new java.lang.SecurityException("Signature does not match");
    }
    messengerService.deliver(url, content, contentType, secret);
}