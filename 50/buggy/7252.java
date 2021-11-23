@java.lang.Override
public void run(org.spongepowered.api.entity.living.Living owner, org.spongepowered.api.entity.living.Living target, org.spongepowered.api.event.entity.DamageEntityEvent event) {
    if (target instanceof org.spongepowered.api.entity.living.player.Player) {
        processAttackOnPlayer(owner, ((org.spongepowered.api.entity.living.player.Player) (target)));
    }else {
        processAttackOnEntity(owner, event);
    }
}