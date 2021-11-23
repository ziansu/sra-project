public void write(byte[] bytes) {
    if (bytes == null) {
        return ;
    }
    try {
        mOutputStream.write(bytes);
    } catch (java.io.IOException ex) {
        com.adamnickle.deck.Deck.log("An error occurred while writing to a connection.", ex);
    }
}