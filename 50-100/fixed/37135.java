public void setEntity(net.minecraft.entity.Entity entity) {
    this.entity = entity;
    playerswinglasttime = entity.worldObj.getTotalWorldTime();
    loadTagData();
    if (entity instanceof net.minecraft.entity.player.EntityPlayer) {
        player_state = 0;
        potential = calculatePotential();
    }else
        if (entity instanceof com.MadokaMagica.mod_madokaMagica.entities.EntityPMWitch) {
            player_state = 2;
        }else
            if (entity instanceof com.MadokaMagica.mod_madokaMagica.entities.EntityPMWitchMinion) {
                player_state = 3;
            }else {
                player_state = -1;
            }
        
    
    ready = true;
}