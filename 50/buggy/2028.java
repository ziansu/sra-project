int refill(int ammoSupply) {
    int emptySlots = (maxAmmo) - (currentAmmo);
    currentAmmo += (emptySlots > ammoSupply) ? ammoSupply : emptySlots;
    ammoSupply -= (emptySlots > ammoSupply) ? 0 : emptySlots;
    return ammoSupply;
}