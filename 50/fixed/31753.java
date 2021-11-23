public boolean removeEnergy(int energy) {
    if (energy <= (energyNumber)) {
        this.energyNumber -= energy;
        return true;
    }else {
        return false;
    }
}