private void handleInteract(game.control.packets.Packet06Interact packet) {
    game.handleInteract(packet.getUsername(), packet.getObjectID());
}