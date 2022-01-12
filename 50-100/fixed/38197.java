@java.lang.Override
public void apply(final java.lang.Object res) {
    int _size = ((java.util.List<java.lang.Object>) (res)).size();
    boolean _notEquals = _size != 3;
    if (_notEquals) {
        java.lang.Exception _exception = new java.lang.Exception("Invalid number of results.");
        callback.onFailure(_exception);
        return ;
    }
    callback.onSuccess(Success.INSTANCE);
}