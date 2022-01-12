public boolean loadPointers() {
    if ((imageResources) != null) {
        myProjectiles = new abyssproductions.double0driver.GameObjects.Projectile[abyssproductions.double0driver.GameGlobals.myProjectileArrSize];
        for (int i = 0; i < (abyssproductions.double0driver.GameGlobals.myProjectileArrSize); i++) {
            myProjectiles[i] = null;
        }
        return true;
    }
    return false;
}