public boolean isLoginSuccessful(java.lang.String encodedToken) {
    java.util.Map<java.lang.String, java.lang.String> loginRequestHeaders = new java.util.HashMap<>();
    loginRequestHeaders.put("Authorization", ("Basic " + encodedToken));
    java.lang.String loginRequestResult = com.auction.auction.utils.GetRequestUtils.make(com.auction.auction.data.services.AuthenticationRemoteService.LOGIN_REQUEST_URL, loginRequestHeaders);
    if (loginRequestResult.equals("Authorized")) {
        return true;
    }
    return false;
}