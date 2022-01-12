@java.lang.Override
protected void onImpact(net.minecraft.util.MovingObjectPosition movingObjectPosition) {
    net.minecraft.world.World world = this.worldObj;
    if (!(world.isRemote))
        if ((this.ticksSinceWet) < (io.github.anon10w1z.craftPP.entities.EntityDynamite.WET_TICKS)) {
            if (isNotCreativeThrower())
                this.dropItem(CppItems.dynamite, 1);
            
        }else
            world.createExplosion(this.getThrower(), this.posX, this.posY, this.posZ, 2.0F, true);
        
    
    this.setDead();
}