protected void login(java.lang.String token, java.lang.String adminId) {
    de.btobastian.javacord.DiscordAPI api = de.btobastian.javacord.Javacord.getApi(token, true);
    this.adminId = adminId;
    api.connect(this);
}