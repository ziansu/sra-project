private void cancelCalls() {
    for (java.lang.Object tag : mCallsMap.keySet()) {
        internalCancelCalls(tag);
    }
    mCallsMap.clear();
}