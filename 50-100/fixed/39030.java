private void waitForOk(int maxWaitTimeMillis) throws java.io.IOException {
    int waitTime = 0;
    while (true) {
        com.robo4j.hw.rpi.i2c.imu.BNO055SystemStatus systemStatus = getSystemStatus();
        if ((((systemStatus == (BNO055SystemStatus.IDLE)) || (systemStatus == (BNO055SystemStatus.RUNNING_NO_SENSOR_FUSION))) || (systemStatus == (BNO055SystemStatus.RUNNING_SENSOR_FUSION))) || (waitTime >= maxWaitTimeMillis)) {
            break;
        }
        sleep(com.robo4j.hw.rpi.i2c.imu.BNO055Device.WAIT_STEP_MILLIS);
        waitTime += com.robo4j.hw.rpi.i2c.imu.BNO055Device.WAIT_STEP_MILLIS;
    } 
}