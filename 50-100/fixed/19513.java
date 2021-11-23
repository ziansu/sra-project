public boolean isValid(engine.network.client.Client client) {
    entity.mobs.PlayerMob player = client.getPlayer();
    if (player != null) {
        if (((player.getSelectedItem()) != null) && (isValid(player.getSelectedItem().item)))
            return true;
        
    }
    return false;
}