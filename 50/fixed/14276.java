public int energy_getEnergyStored() {
    return ((int) (cr0s.warpdrive.Commons.clamp(0L, energy_getMaxStorage(), energyStored_internal)));
}