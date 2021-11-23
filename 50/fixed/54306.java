@org.spongepowered.api.event.Listener(order = org.spongepowered.api.event.Order.POST)
public void onPlayerLeave(org.spongepowered.api.event.network.ClientConnectionEvent.Disconnect event) {
    org.spongepowered.api.entity.living.player.Player player = event.getTargetEntity();
    com.nearce.gamechatter.ChatParticipant participant = new com.nearce.gamechatter.sponge.SpongeChatParticipant(player, player.getUniqueId(), player.getName());
    participants.remove(participant);
}