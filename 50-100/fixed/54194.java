public org.springframework.messaging.Message<?> postReceive(org.springframework.messaging.Message<?> message, org.springframework.messaging.MessageChannel channel) {
    if ((this.size) > 0) {
        for (org.springframework.messaging.support.ChannelInterceptor interceptor : interceptors) {
            message = interceptor.postReceive(message, channel);
            if (message == null) {
                return null;
            }
        }
    }
    return message;
}