private void createRoom(int roomID, java.lang.String[] wallDescriptors) {
    renderer.createRoom(roomID, wallDescriptors);
    java.lang.String clientWallDescriptors = "";
    for (java.lang.String str : wallDescriptors) {
        clientWallDescriptors = clientWallDescriptors.concat((str + ":"));
    }
    com.semaphore_soft.apps.cypher.PortalActivity.serverService.writeAll(((((com.semaphore_soft.apps.cypher.networking.NetworkConstants.PREFIX_CREATE_ROOM) + roomID) + ":") + clientWallDescriptors));
}