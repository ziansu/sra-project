@java.lang.Override
public org.apache.flume.interceptor.Interceptor build() {
    return new com.wxmimperio.flume.interceptors.JsonInterceptor(context);
}