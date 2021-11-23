private void initIOInterface() throws java.lang.Exception {
    loadIOInterface();
    com.bookmarking.bootstrap.MessageBoard messageBoard = com.bookmarking.bootstrap.MessageBoard.use();
    for (com.bookmarking.bootstrap.AbstractBookmark abs : this.ioInterface.getAllBookmarks()) {
        messageBoard.setSecretKey(abs);
    }
}