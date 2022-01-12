public void startLaunch(net.minecraft.entity.player.EntityPlayer player) {
    if ((((((!(launching)) && ((getControlPanel()) != null)) && ((getSupportFrame()) != null)) && ((missile) != null)) && (canExtractEnergy(energyCost))) && (isPathClear())) {
        launching = true;
    }else
        printErrorMessage(player);
    
}