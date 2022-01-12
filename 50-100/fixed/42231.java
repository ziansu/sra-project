public void exceptionHandler(int responseCode) throws java.lang.Exception {
    android.util.Log.w(TAG, ("response code: " + responseCode));
    switch (responseCode) {
        case 200 :
            break;
        case 303 :
            throw new android.accounts.AuthenticatorException("Not logged in");
        case 400 :
            throw new sintef.android.emht.sync.RestAPIClient.BadRequestException("Bad request");
        case 403 :
            throw new android.accounts.AuthenticatorException("Forbidden");
        case 500 :
            throw new sintef.android.emht.sync.RestAPIClient.ServerErrorException("Server is down");
        default :
            throw new java.lang.Exception("Unknown exception");
    }
}