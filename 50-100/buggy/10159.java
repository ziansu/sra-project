protected java.util.concurrent.CompletionStage<java.util.Optional<java.lang.String>> getCustomTypeId(@javax.annotation.Nonnull
final io.sphere.sdk.types.CustomFieldsDraft customFieldsDraft) {
    try {
        final java.lang.String customTypeKey = getKeyFromResourceIdentifier(customFieldsDraft.getType());
        return typeService.fetchCachedTypeId(customTypeKey);
    } catch (com.commercetools.sync.commons.exceptions.ReferenceResolutionException exception) {
        final com.commercetools.sync.commons.exceptions.ReferenceResolutionException referenceResolutionException = new com.commercetools.sync.commons.exceptions.ReferenceResolutionException(com.commercetools.sync.commons.helpers.BaseReferenceResolver.buildErrorMessage(com.commercetools.sync.commons.helpers.BaseReferenceResolver.FAILED_TO_RESOLVE_CUSTOM_TYPE, exception), exception);
        return io.sphere.sdk.utils.CompletableFutureUtils.exceptionallyCompletedFuture(referenceResolutionException);
    }
}