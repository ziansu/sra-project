public boolean add(org.springframework.messaging.support.ChannelInterceptor interceptor) {
    (this.size)++;
    return this.interceptors.add(interceptor);
}