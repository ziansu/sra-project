@java.lang.Override
public double getMountedYOffset() {
    if (((missileFlightTime) <= 0) && ((missileType) == (defense.common.entity.EntityMissile.MissileType.MISSILE))) {
        return height;
    }else
        if ((missileType) == (defense.common.entity.EntityMissile.MissileType.CruiseMissile)) {
            return (height) / 10;
        }
    
    return ((height) / 2) + (motionY);
}