@java.lang.Override
protected void setup(sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent event) {
    super.setup(event);
    tokens.remove(0);
}