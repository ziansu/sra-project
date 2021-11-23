@java.lang.Override
public double getMountedYOffset() {
    if (((this.missileFlightTime) <= 0) && ((this.missileType) == (defense.common.entity.EntityMissile.MissileType.MISSILE))) {
        return height;
    }else
        if ((this.missileType) == (defense.common.entity.EntityMissile.MissileType.CruiseMissile)) {
            return (height) / 10;
        }
    
    return ((height) / 2) + (motionY);
}