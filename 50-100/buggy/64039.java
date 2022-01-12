public void postSend(org.springframework.messaging.Message<?> message, org.springframework.messaging.MessageChannel channel, boolean sent) {
    if ((this.interceptors.size()) > 0) {
        for (org.springframework.messaging.support.ChannelInterceptor interceptor : interceptors) {
            interceptor.postSend(message, channel, sent);
        }
    }
}