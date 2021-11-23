public boolean isValid(engine.network.client.Client client) {
    entity.mobs.PlayerMob player = client.getPlayer();
    if (player != null) {
        if (((player.getSelectedItem()) != null) && (player.getSelectedItem().item.getSidebar().name.equals(name)))
            return true;
        
    }
    return false;
}