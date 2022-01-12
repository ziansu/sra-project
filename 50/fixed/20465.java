@java.lang.Override
public void onFriendRequestReceived(net.dv8tion.jda.client.events.relationship.FriendRequestReceivedEvent event) {
    event.getFriendRequest().accept();
    new de.kitt3120.viperbot.objects.MessageBuilder(event.getUser().getPrivateChannel()).append("Thanks for adding me!").send();
}