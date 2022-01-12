@java.lang.Override
public void onMessageDelete(net.dv8tion.jda.core.events.message.MessageDeleteEvent event) {
    if (fredboat.event.EventListenerBoat.messagesToDeleteIfIdDeleted.containsKey(event.getMessageId())) {
        net.dv8tion.jda.core.entities.Message msg = fredboat.event.EventListenerBoat.messagesToDeleteIfIdDeleted.remove(event.getMessageId());
        if ((msg.getJDA()) == (event.getJDA())) {
            msg.deleteMessage().queue();
        }
    }
}