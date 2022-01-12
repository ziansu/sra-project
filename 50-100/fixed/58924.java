@java.lang.Override
protected boolean doHandleRequest(final com.github.bordertech.wcomponents.Request request) {
    java.util.Set<java.lang.String> values = getRequestValue(request);
    java.util.Set<java.lang.String> current = getValue();
    boolean changed = !(selectionsEqual(values, current));
    if (changed) {
        setData(values);
    }
    if (isShuffle()) {
        handleShuffleRequest(request);
    }
    handleExpansionRequest(request);
    return changed;
}