private void handleReloading(dk.gruppeseks.bodtrd.common.data.entityelements.Weapon wep) {
    if (wep.isReloading()) {
        wep.setReloading(false);
        int currentAmmunition = wep.getCurrentAmmunition();
        int removedAmmunition = java.lang.Math.min(currentAmmunition, wep.getMaxMagazineSize());
        wep.setCurrentAmmunition(((currentAmmunition - removedAmmunition) + (wep.getCurrentMagazineSize())));
        wep.setCurrentMagazineSize(removedAmmunition);
    }
}