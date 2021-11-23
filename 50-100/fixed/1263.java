@java.lang.Override
public void enact(sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent messageReceivedEvent, java.lang.String args) {
    sx.blah.discord.handle.obj.IChannel channel = messageReceivedEvent.getChannel();
    try {
        int slotNumber = java.lang.Integer.parseInt(args);
        sessionOrchestrator.switchSave(channel, slotNumber);
    } catch (java.lang.NumberFormatException e) {
        net.tonbot.common.BotUtils.sendMessage(channel, ("You need to enter a number from 0 to " + ((saveManager.getMaxSlots()) - 1)));
        return ;
    }
}