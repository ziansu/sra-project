public rx.Observable<com.microsoft.azure.management.search.implementation.CheckNameAvailabilityOutputInner> checkNameAvailabilityAsync(java.lang.String name) {
    return checkNameAvailabilityWithServiceResponseAsync(name).map(new rx.functions.Func1<com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.search.implementation.CheckNameAvailabilityOutputInner>, com.microsoft.azure.management.search.implementation.CheckNameAvailabilityOutputInner>() {
        @java.lang.Override
        public com.microsoft.azure.management.search.implementation.CheckNameAvailabilityOutputInner call(com.microsoft.rest.ServiceResponse<com.microsoft.azure.management.search.implementation.CheckNameAvailabilityOutputInner> response) {
            return response.body();
        }
    });
}