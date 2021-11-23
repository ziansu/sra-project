public com.massivecraft.massivecore.mson.Mson suggest(com.massivecraft.massivecore.cmd.MassiveCommand command, java.lang.Iterable<java.lang.String> args) {
    this.clickEvent(com.massivecraft.massivecore.mson.MsonEvent.replace(command, args));
    return this;
}