@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    if (caseCallback != null) {
        caseCallback.onError(t);
    }
}