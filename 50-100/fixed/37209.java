public boolean isAFK() {
    if (PircBot.User.isBot(this.getNick())) {
        return false;
    }
    if (isAFK) {
        return true;
    }
    long currentTime = java.lang.System.currentTimeMillis();
    isAFK = (currentTime - (lastMessage)) > 900000;
    return isAFK;
}