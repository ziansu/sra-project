@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.NORMAL)
public void onMoneyDespawnEvent(org.bukkit.event.entity.ItemDespawnEvent e) {
    if (e.getEntity().hasMetadata(RewardManager.MH_MONEY)) {
        one.lindegaard.MobHunting.Messages.debug("The money was lost - despawned (# of rewards left=%s)", one.lindegaard.MobHunting.rewards.RewardManager.getDroppedMoney().size());
        if (one.lindegaard.MobHunting.rewards.RewardManager.getDroppedMoney().containsKey(e.getEntity().getEntityId()))
            one.lindegaard.MobHunting.rewards.RewardManager.getDroppedMoney().remove(e.getEntity().getEntityId());
        
    }
}