public void onDeath(net.minecraft.util.DamageSource sourceOfDamage) {
    fr.elias.common.EntityCup cup = new fr.elias.common.EntityCup(worldObj);
    cup.setPosition(posX, posY, posZ);
    if (!(worldObj.isRemote)) {
        worldObj.spawnEntityInWorld(cup);
    }
    ((net.minecraft.entity.player.EntityPlayer) (sourceOfDamage.getEntity())).triggerAchievement(FakeOres.boss_defeated);
}