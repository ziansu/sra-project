public boolean shoot() {
    if ((currentAmmo) <= 0) {
        return false;
    }
    if (!(gunCanShoot()))
        return false;
    
    (currentAmmo)--;
    isom3320.Main.playSound(isom3320.GameObjectGun.name[index]);
    cantShootFor(isom3320.GameObjectGun.delayPerShot[index]);
    user.cantShootFor(getDelay());
    return true;
}