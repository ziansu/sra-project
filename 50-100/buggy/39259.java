private boolean isThisIgnored(java.lang.String sender) {
    return ((this.plugin.cUseMapAsWhitelist(this.botId)) && (!(this.plugin.cNicknameIsInIrcMap(this.botId, sender)))) || (this.ignores.contains(sender));
}