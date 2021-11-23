public com.massivecraft.massivecore.mson.Mson command(java.lang.String command) {
    return this.clickEvent(com.massivecraft.massivecore.mson.MsonEvent.performCmd(command));
}