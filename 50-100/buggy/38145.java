private static java.lang.String composeParametersToString() {
    int nonce = com.internship.pbt.bizarechat.data.util.HmacSha1Signature.randomizer.nextInt();
    long timestamp = (new java.util.Date().getTime()) / 1000;
    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
    sb.append("application_id=").append(com.internship.pbt.bizarechat.data.net.ApiConstants.APP_ID);
    sb.append("&auth_key=").append(com.internship.pbt.bizarechat.data.net.ApiConstants.AUTH_KEY);
    sb.append("&nonce=").append(nonce);
    sb.append("&timestamp=").append(timestamp);
    return sb.toString();
}