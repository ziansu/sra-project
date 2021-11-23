public iohelper.packet.SyncState composeState() {
    return new iohelper.packet.SyncState(new java.util.ArrayList(projectiles), new java.util.ArrayList(explosions), new java.util.ArrayList(enemies), new java.util.ArrayList(jetfighters), currentUsername);
}