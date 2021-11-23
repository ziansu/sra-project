@java.lang.Override
public void onError(java.lang.Throwable t) {
    super.onError(t);
    subscriber.onError(t);
}