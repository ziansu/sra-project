public void toggleLaunch(net.minecraft.entity.player.EntityPlayer player) {
    if (launching)
        launching = false;
    else
        startLaunch(player);
    
    update();
}