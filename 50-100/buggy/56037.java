public static void sendErrorToCallbacks(@android.support.annotation.Nullable
java.util.List callbacks, java.lang.Long errorCode, java.lang.String errorMessage) {
    if (callbacks == null)
        return ;
    
    com.tapglue.networking.requests.TGRequestErrorType error = new com.tapglue.networking.requests.TGRequestErrorType(errorCode, errorMessage);
    for (int i = 0; i < (callbacks.size()); i++) {
        java.lang.Object callback = callbacks.get(i);
        if (!(callback instanceof com.tapglue.networking.requests.TGRequestCallback<?>)) {
            continue;
        }
        ((com.tapglue.networking.requests.TGRequestCallback<?>) (callback)).onRequestError(error);
    }
}