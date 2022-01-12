public com.Message getMessage(java.lang.String verb) {
    com.Message msg = null;
    java.util.Iterator<com.Message> iter = messages.iterator();
    while (msg == null) {
        while (iter.hasNext()) {
            com.Message message = ((com.Message) (iter.next()));
            if (message.getVerb().equals(verb)) {
                messages.remove(message);
                msg = message;
            }
        } 
    } 
    return msg;
}