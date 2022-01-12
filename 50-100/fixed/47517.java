public void onJoin(org.spongepowered.api.entity.living.player.Player player) {
    if (server.getWorldProperties(player.getName()).isPresent()) {
        if (!(player.getWorld().getName().equals(player.getName()))) {
            teleport(player);
        }
    }else {
        createWorld(player);
    }
}