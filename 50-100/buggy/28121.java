private static void checkResponse(com.squareup.okhttp.Response response) throws com.czbix.v2ex.common.exception.RemoteException, com.czbix.v2ex.common.exception.RequestException {
    if (response.isSuccessful()) {
        return ;
    }
    if ((response.code()) >= (com.czbix.v2ex.network.RequestHelper.SERVER_ERROR_CODE)) {
        throw new com.czbix.v2ex.common.exception.RemoteException();
    }
    if ((response.isRedirect()) && (response.header(com.google.common.net.HttpHeaders.LOCATION).startsWith("/signin"))) {
        throw new com.czbix.v2ex.common.exception.UnauthorizedException(response);
    }
    throw new com.czbix.v2ex.common.exception.RequestException(response);
}