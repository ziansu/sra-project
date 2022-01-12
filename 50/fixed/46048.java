public boolean isUseableByPlayer(net.minecraft.entity.player.EntityPlayer entityplayer) {
    return (!(isDead)) && ((entityplayer.getDistanceSqToEntity(this)) <= 300.0);
}