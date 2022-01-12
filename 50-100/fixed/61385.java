public boolean shoot() {
    if ((currentAmmo) <= 0) {
        return false;
    }
    if (!(gunCanShoot()))
        return false;
    
    (currentAmmo)--;
    cantShootFor(isom3320.GameObjectGun.delayPerShot[index]);
    user.cantShootFor(getDelay());
    return true;
}