@dagger.Provides
@javax.inject.Singleton
@com.mounacheikhna.trips.annotation.ApiClient
okhttp3.OkHttpClient provideApiClient(okhttp3.OkHttpClient client) {
    return client;
}