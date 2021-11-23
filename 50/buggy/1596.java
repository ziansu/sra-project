@io.realm.internal.KeepMember
void notifySessionError(int errorCode, java.lang.String errorMessage) {
    io.realm.ObjectServerError error = new io.realm.ObjectServerError(io.realm.ErrorCode.fromInt(errorCode), errorMessage);
    onError(error);
}