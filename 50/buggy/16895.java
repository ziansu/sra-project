@me.ykrank.s1next.widget.net.Data
@dagger.Provides
@javax.inject.Singleton
okhttp3.OkHttpClient providerDataOkHttpClient(@me.ykrank.s1next.widget.net.Data
okhttp3.OkHttpClient.Builder builder) {
    com.google.common.base.Preconditions.checkState("release".equals(BuildConfig.BUILD_TYPE));
    return builder.build();
}