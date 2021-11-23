public void setShotMe(coderdojo.bots.robobrain.HitByBulletEvent shotMe) {
    this.shotMe = shotMe;
    setLastBearing(shotMe.getBearing());
}