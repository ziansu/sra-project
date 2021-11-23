public boolean isSentByUser() {
    return (MainActivity.user.getParseID()) == (this.senderID);
}