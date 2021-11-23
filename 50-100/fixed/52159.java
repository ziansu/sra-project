@javax.inject.Singleton
@dagger.Provides
public com.okawa.pedro.rentapp.network.ApiInterface providesApiInterface() {
    return new retrofit2.Retrofit.Builder().baseUrl(com.okawa.pedro.rentapp.di.module.ApiModule.BASE_URL).client(new okhttp3.OkHttpClient()).addConverterFactory(retrofit2.GsonConverterFactory.create()).addCallAdapterFactory(retrofit2.RxJavaCallAdapterFactory.create()).build().create(com.okawa.pedro.rentapp.network.ApiInterface.class);
}