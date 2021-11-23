protected void wasShoot() {
    updateAim();
    wasJustShoot = true;
    armLengt -= BACK_FIRE;
    explostions.add(new float[]{ aimAtX , aimAtY , (se.BaseUlterior.Aim.AimBulletWeapon.SMOKE_LENGTH) / 2 });
    rays.add(new float[]{ gunFireStartAtX , gunFireStartAtY , aimAtX , aimAtY , se.BaseUlterior.Aim.AimBulletWeapon.SMOKE_LENGTH });
}