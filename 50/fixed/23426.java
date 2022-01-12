public network.models.JSONMessageResponse.Message tryDequeue() {
    return messageQueue.poll();
}