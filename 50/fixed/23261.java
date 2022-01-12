private void crack(java.lang.Object object) {
    if (object instanceof messages.Message) {
        onMessage(((messages.Message) (object)));
    }else
        if (object instanceof java.lang.String) {
            onMessage(((java.lang.String) (object)));
        }
    
}