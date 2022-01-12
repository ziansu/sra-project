public boolean preReceive(org.springframework.messaging.MessageChannel channel, java.util.Deque<org.springframework.messaging.support.ChannelInterceptor> interceptorStack) {
    if ((this.size) > 0) {
        for (org.springframework.messaging.support.ChannelInterceptor interceptor : interceptors) {
            if (!(interceptor.preReceive(channel))) {
                afterReceiveCompletion(null, channel, null, interceptorStack);
                return false;
            }
            interceptorStack.add(interceptor);
        }
    }
    return true;
}