public final void setResult(com.shkil.android.util.Result<V> result, boolean forceReleaseLatch) {
    fireResult(result);
    if ((result.isCompleted()) || forceReleaseLatch) {
        resultLatch.countDown();
    }
}