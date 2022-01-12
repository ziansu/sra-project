public synchronized void onError(io.realm.ObjectServerError error) {
    currentState.onError(error);
    if ((errorHandler) != null) {
        errorHandler.onError(getUserSession(), error);
    }
}