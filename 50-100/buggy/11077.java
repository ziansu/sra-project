protected void addTurretAngle(float deltaTurretAngle, int delta) {
    float cleanDeltaTurret = kylevedder.com.github.utils.Utils.wrapAngleDelta(deltaTurretAngle);
    float turretRateCap = (delta > 0) ? (this.TURRET_TURN_RATE) / (1000 / delta) : 0;
    this.turretAngle = kylevedder.com.github.utils.Utils.wrapAngle(this.turretAngle, kylevedder.com.github.utils.Utils.clampFloat(cleanDeltaTurret, (-turretRateCap), turretRateCap));
}