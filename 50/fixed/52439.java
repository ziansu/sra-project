@javax.inject.Singleton
@dagger.Provides
android.net.ConnectivityManager provideConnectivityManager() {
    return ((android.net.ConnectivityManager) (application.getSystemService(Context.CONNECTIVITY_SERVICE)));
}