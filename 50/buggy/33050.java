@org.spongepowered.api.event.Listener(order = org.spongepowered.api.event.Order.POST)
public void onPlayerJoin(org.spongepowered.api.event.network.ClientConnectionEvent.Join event) {
    org.spongepowered.api.entity.living.player.Player player = event.getTargetEntity();
    com.nearce.gamechatter.ChatParticipant participant = new com.nearce.gamechatter.sponge.SpongeChatParticipant(player.getMessageChannel(), player.getUniqueId(), player.getName());
    participants.add(participant);
}