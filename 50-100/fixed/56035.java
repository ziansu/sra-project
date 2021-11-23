@dagger.Provides
@javax.inject.Singleton
retrofit2.Retrofit provideRetrofit(okhttp3.OkHttpClient okHttpClient) {
    retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder().addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create()).addCallAdapterFactory(retrofit2.adapter.rxjava.RxJavaCallAdapterFactory.createWithScheduler(rx.schedulers.Schedulers.io())).baseUrl(mBaseUrl).client(okHttpClient).build();
    return retrofit;
}