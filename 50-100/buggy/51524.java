@java.lang.Override
protected final synchronized boolean deleteBlocking(@android.support.annotation.NonNull
ModelType modelType) {
    final boolean deleteResult = super.deleteBlocking(modelType);
    if (deleteResult) {
        final co.smartreceipts.android.model.Trip trip = getTripFor(modelType);
        if (mPerTripCache.containsKey(trip)) {
            final java.util.List<ModelType> perTripResults = mPerTripCache.get(trip);
            perTripResults.remove(modelType);
        }
    }
    return deleteResult;
}