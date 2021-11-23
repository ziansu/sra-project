public static com.google.android.gms.common.api.GoogleApiClient getInstance(android.content.Context application, com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> listener) {
    if ((hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider.providerInstance) == null) {
        hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider.providerInstance = new hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider();
        hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider.providerInstance.buildClient(application);
        hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider.providerInstance.listeners = new java.util.ArrayList<>();
    }
    hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider.providerInstance.listeners.add(listener);
    return hk.ust.cse.comp4521.reminder.service.GoogleApiClientProvider.providerInstance.mGoogleApiClient;
}