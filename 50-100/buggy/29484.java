public static okhttp3.Interceptor getLoggingIntercaptor() {
    if (true)
        return null;
    
    com.ihsanbal.logging.LoggingInterceptor.Builder loggingInterceptor = new com.ihsanbal.logging.LoggingInterceptor.Builder();
    loggingInterceptor.loggable(true).setLevel(Level.BASIC).log(Platform.INFO).request("Request").response("Response").addHeader("version", BuildConfig.VERSION_NAME);
    return loggingInterceptor.build();
}