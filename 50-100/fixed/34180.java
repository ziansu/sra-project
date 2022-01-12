public org.springframework.messaging.MessageChannel getRequestChannel() {
    if ((this.requestChannelName) != null) {
        synchronized(this) {
            if ((this.requestChannelName) != null) {
                this.requestChannel = getChannelResolver().resolveDestination(this.requestChannelName);
                this.requestChannelName = null;
            }
        }
    }
    return this.requestChannel;
}