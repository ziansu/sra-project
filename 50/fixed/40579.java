protected final org.springframework.messaging.MessageHeaders extractHeaders(org.springframework.messaging.Message message) {
    return this.headerMapper.toHeaders(message);
}