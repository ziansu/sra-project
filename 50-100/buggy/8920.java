@java.lang.Override
protected void onAction(java.lang.String sender, java.lang.String login, java.lang.String hostname, java.lang.String target, java.lang.String action) {
    java.lang.String nickName = this.stripNickname(sender);
    de.skuzzle.polly.sdk.eventlistener.IrcUser user = new de.skuzzle.polly.sdk.eventlistener.IrcUser(nickName, login, hostname);
    de.skuzzle.polly.sdk.eventlistener.MessageEvent e = new de.skuzzle.polly.sdk.eventlistener.MessageEvent(this, user, nickName, action);
    this.fireActionMessageEvent(e);
}