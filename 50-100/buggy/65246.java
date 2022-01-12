@java.lang.Override
public okhttp3.Response intercept(com.example.com.socialnetwork.ws.Chain chain) throws java.io.IOException {
    okhttp3.Request request = chain.request().newBuilder().header("Content-Type", "application/json").header("Accept", "*/*").header("Accept-Encoding", "gzip, deflate").header("Accept-Language", "en-US,en;q=0.8").header("Connection", "keep-alive").header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36").header("Host", "192.168.0.26:5000").header("X-CSRFToken", "VIAMlO5RfIqRgdxxTvqwAu9asFBEMv9h").header("Cookie", "csrftoken=VIAMlO5RfIqRgdxxTvqwAu9asFBEMv9h").build();
    return chain.proceed(request);
}