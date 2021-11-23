public boolean createSynchronizedMotorEndpoint() {
    if ((syncedMotorGroup) == null) {
        syncedMotorGroup = new mindroid.common.ev3.endpoints.motors.ev3.synchronization.SynchronizedRegulatedMotorGroup(this);
    }
    if ((syncedMotorEndpoint) == null) {
        mindroid.common.ev3.endpoints.SyncedMotorGroupEndpoint syncedMotorEndpoint = new mindroid.common.ev3.endpoints.SyncedMotorGroupEndpoint(syncedMotorGroup);
        mindroid.common.ev3.server.BrickServerImpl brickServer = new mindroid.common.ev3.server.BrickServerImpl(org.mindroid.common.messages.NetworkPortConfig.SYNCED_MOTOR_GROUP);
        brickServer.addListener(syncedMotorEndpoint);
    }
    return true;
}