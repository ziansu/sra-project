public boolean isSentByUser() {
    return MainActivity.user.getParseID().equals(this.senderID);
}