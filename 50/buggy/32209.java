@java.lang.Override
public void tell(org.netlight.messaging.actors.Message message, org.netlight.channel.ChannelContext ctx, int weight) {
    load.getAndAdd(weight);
    mailbox.add(new org.netlight.messaging.actors.RichMessage(message, ctx, java.lang.System.currentTimeMillis(), weight));
}