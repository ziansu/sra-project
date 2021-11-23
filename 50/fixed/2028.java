int refill(int ammoSupply) {
    int emptySlots = (maxAmmo) - (currentAmmo);
    currentAmmo += (emptySlots > ammoSupply) ? ammoSupply : emptySlots;
    ammoSupply -= (emptySlots > ammoSupply) ? ammoSupply : emptySlots;
    return ammoSupply;
}