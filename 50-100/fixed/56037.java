public static void sendErrorToCallbacks(@android.support.annotation.Nullable
java.util.List callbacks, com.tapglue.networking.requests.TGRequestErrorType error) {
    if (callbacks == null)
        return ;
    
    for (int i = 0; i < (callbacks.size()); i++) {
        java.lang.Object callback = callbacks.get(i);
        if (callback instanceof com.tapglue.networking.requests.TGRequestCallback) {
            ((com.tapglue.networking.requests.TGRequestCallback) (callback)).onRequestError(error);
        }
    }
}