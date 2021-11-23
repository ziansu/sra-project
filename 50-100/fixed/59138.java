public void finalizePlayerRegistration(org.apollo.game.model.entity.Player player) {
    world.register(player);
    org.apollo.game.model.area.Region region = world.getRegionRepository().fromPosition(player.getPosition());
    region.addEntity(player);
    if (!(player.getSession().isReconnecting())) {
        player.sendInitialMessages();
    }
}