public boolean setRestored(com.aleksey.castlegates.types.GearState addedGear) {
    if ((this.gear1) == null) {
        gear1 = addedGear;
    }else {
        gear2 = addedGear;
    }
    return true;
}