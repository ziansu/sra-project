private static void init() {
    com.example.yang.washere.FindMsssage.NetworkUtils.okHttpClient = new okhttp3.OkHttpClient.Builder().readTimeout(2000, java.util.concurrent.TimeUnit.MILLISECONDS).build();
}