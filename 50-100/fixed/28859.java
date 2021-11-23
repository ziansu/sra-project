public java.util.LinkedList<Message> findByKeyword(final java.lang.String keyword) {
    java.util.LinkedList<Message> searchResult = new java.util.LinkedList<>();
    for (Message msg : messages) {
        if (msg.getText().contains(keyword)) {
            searchResult.add(new Message(msg));
        }
    }
    return searchResult;
}