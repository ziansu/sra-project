private void crack(java.lang.Object object) {
    if (object instanceof messages.Message) {
        onMessage(((messages.Message) (object)));
    }
}