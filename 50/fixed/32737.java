private void onSessionFailure(java.lang.Exception ex) {
    if ((mListener) != null) {
        mListener.failure(new com.oneall.oneallsdk.OAError(OAError.ErrorCode.OA_ERROR_AUTH_FAIL, (ex != null ? ex.getMessage() : null)));
    }
}