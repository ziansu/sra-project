public com.Message getMessage(java.lang.String verb) {
    com.Message msg = null;
    while (msg == null) {
        for (int i = 0; i < (messages.size()); i++) {
            if (messages.get(i).getVerb().equals(verb)) {
                msg = messages.get(i);
                messages.remove(i);
            }
        }
    } 
    return msg;
}