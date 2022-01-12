private void updateData() {
    try {
        data.add(new sensors.Data3D(((readWord_2C(sensors.HMC5883L.HMC5883L_X_ADR)) * (sensors.HMC5883L.SCALE)), ((readWord_2C(sensors.HMC5883L.HMC5883L_Y_ADR)) * (sensors.HMC5883L.SCALE)), ((readWord_2C(sensors.HMC5883L.HMC5883L_Z_ADR)) * (sensors.HMC5883L.SCALE))));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}