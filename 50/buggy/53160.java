public com.example.common.QueueMessage getMessage() {
    if ((queueMessageList.size()) > 0) {
        return queueMessageList.peek();
    }else {
        return null;
    }
}