public void setHealthD(double health) {
    org.spongepowered.api.entity.living.Living thisEntity = ((org.spongepowered.api.entity.living.Living) (this));
    setHealth(((float) (health)));
    if ((thisEntity instanceof net.minecraft.entity.player.EntityPlayer) && (health == 0)) {
        ((net.minecraft.entity.player.EntityPlayer) (thisEntity)).onDeath(DamageSource.generic);
    }
}