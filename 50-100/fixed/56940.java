@org.kitteh.irc.lib.net.engio.mbassy.listener.Handler
public boolean messageEvent(org.kitteh.irc.client.library.event.channel.ChannelMessageEvent event) throws java.io.IOException {
    java.lang.String message = event.getMessage();
    if (message.startsWith(cmdOper)) {
        return cmdReg.get(getFirstWord(message)).execute(event.getChannel(), event.getActor(), getArgs(message));
    }
    return false;
}