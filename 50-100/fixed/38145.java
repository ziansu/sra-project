private static java.lang.String composeParametersToString(int nonce, long timestamp) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("");
    sb.append("application_id=").append(com.internship.pbt.bizarechat.data.net.ApiConstants.APP_ID);
    sb.append("&auth_key=").append(com.internship.pbt.bizarechat.data.net.ApiConstants.AUTH_KEY);
    sb.append("&nonce=").append(nonce);
    sb.append("&timestamp=").append(timestamp);
    return sb.toString();
}