private void movePlayerToBufferIfNeeded() {
    if ((mapController.getPlayerBufferPosition()) != null) {
        mapController.updatePlayerPosition(mapController.getPlayerBufferPosition());
        mapController.setPlayerBufferPosition(null);
        updateZombiePaths();
    }
}