public boolean set(java.util.List<org.springframework.messaging.support.ChannelInterceptor> interceptors) {
    synchronized(this.interceptors) {
        this.interceptors.clear();
        this.size = interceptors.size();
        return this.interceptors.addAll(interceptors);
    }
}