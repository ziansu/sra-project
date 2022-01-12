public boolean isCompleteResult(final int resultId) {
    checkFutureSize(resultId);
    if (!(resultComplete.containsKey(resultId))) {
        return false;
    }
    return resultComplete.get(resultId);
}