@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onPrivateMessage(net.blay09.mods.eirairc.api.event.IRCPrivateChatEvent event) {
    if ((event.sender) == null) {
        return ;
    }
    mnm.mods.tabbychat.api.Channel channel = mnm.mods.tabbychat.api.TabbyAPI.getAPI().getChat().getChannel(event.sender.getName(), true);
    channel.setPrefixHidden(true);
    channel.setPrefix((("/irc msg " + (event.sender.getIdentifier())) + " "));
}