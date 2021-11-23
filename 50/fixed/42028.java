public void setShotMe(coderdojo.bots.robobrain.HitByBulletEvent shotMe) {
    this.shotMe = shotMe;
    if (shotMe != null)
        setLastBearing(shotMe.getBearing());
    
}