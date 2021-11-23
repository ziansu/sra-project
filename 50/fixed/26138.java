@java.lang.Override
public void error(java.lang.String errorMsg) {
    callback.onFail(ErrorMessage.FAILED_TO_CALL_GOOGLE_API_SERVICES, errorMsg);
}