@java.lang.Override
public void run() {
    final com.spotify.folsom.client.Request<?> head = outstanding.peek();
    if (head == null) {
        return ;
    }
    if (timeoutChecker.check(head)) {
        log.error("Request timeout: {} {}", channel, head);
        this.setDisconnected("Timeout");
        channel.close();
    }
}