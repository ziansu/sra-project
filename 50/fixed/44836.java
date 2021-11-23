@java.lang.Override
public int acceptEnergy(int amt, boolean simulate) {
    int energyRecieved = 0;
    for (zmaster587.libVulpes.api.IUniversalEnergy battery : batteries)
        energyRecieved += battery.acceptEnergy((amt - energyRecieved), simulate);
    
    return energyRecieved;
}