public com.massivecraft.massivecore.mson.Mson suggest(com.massivecraft.massivecore.cmd.MassiveCommand command, java.lang.String... args) {
    return this.clickEvent(com.massivecraft.massivecore.mson.MsonEvent.replace(command, args));
}