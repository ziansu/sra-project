protected java.util.concurrent.CompletionStage<java.util.Optional<java.lang.String>> getCustomTypeId(@javax.annotation.Nonnull
final io.sphere.sdk.types.CustomFieldsDraft customFieldsDraft) {
    try {
        final java.lang.String customTypeKey = getKeyFromResourceIdentifier(customFieldsDraft.getType());
        return typeService.fetchCachedTypeId(customTypeKey);
    } catch (com.commercetools.sync.commons.exceptions.ReferenceResolutionException exception) {
        return io.sphere.sdk.utils.CompletableFutureUtils.exceptionallyCompletedFuture(exception);
    }
}