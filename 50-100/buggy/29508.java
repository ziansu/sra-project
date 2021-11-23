private void handleReloading(dk.gruppeseks.bodtrd.common.data.entityelements.Weapon wep) {
    if (wep.isReloading()) {
        int currentAmmunition = wep.getCurrentAmmunition();
        int removedAmmunition = java.lang.Math.min(currentAmmunition, wep.getMaxMagazineSize());
        wep.setCurrentAmmunition(((currentAmmunition - removedAmmunition) + (wep.getCurrentMagazineSize())));
        wep.setCurrentMagazineSize(removedAmmunition);
        wep.setReloading(false);
    }
}