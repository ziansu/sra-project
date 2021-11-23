public void addMovementToBuffer(xyz.arturinsh.Network.Packets.PlayerPositionUpdate update) {
    movementBuffer.add(update);
    java.lang.System.out.println("Add to buffer");
}