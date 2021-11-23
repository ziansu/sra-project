public boolean remove(org.springframework.messaging.support.ChannelInterceptor interceptor) {
    if (this.interceptors.remove(interceptor)) {
        (this.size)--;
        return true;
    }else {
        return false;
    }
}