private de.developgroup.mrf.rover.collision.CollisionState convertSensorReadingToCollisionState(double sensorReading) {
    de.developgroup.mrf.rover.collision.CollisionState retVal = CollisionState.None;
    if (sensorReading >= (THR_COLLISION_FAR)) {
        retVal = CollisionState.Far;
    }
    if (sensorReading >= (THR_COLLISION_MED)) {
        retVal = CollisionState.Medium;
    }
    if (sensorReading >= (THR_COLLISION_CLOSE)) {
        retVal = CollisionState.Close;
    }
    return retVal;
}