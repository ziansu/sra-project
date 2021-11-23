protected <T extends com.google.android.gms.common.api.Result> void setupFitnessPendingResult(com.google.android.gms.common.api.PendingResult<T> pendingResult, com.google.android.gms.common.api.ResultCallback<? super T> resultCallback) {
    if (((timeoutTime) != null) && ((timeoutUnit) != null)) {
        pendingResult.setResultCallback(resultCallback, timeoutTime, timeoutUnit);
    }else {
        pendingResult.setResultCallback(resultCallback);
    }
}