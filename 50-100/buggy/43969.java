@java.lang.Override
public void setRawData(com.kauailabs.navx.AHRSProtocol.GyroUpdate raw_data_update) {
    synchronized(this) {
        this.raw_gyro_x = raw_data_update.gyro_x;
        this.raw_gyro_y = raw_data_update.gyro_y;
        this.raw_gyro_z = raw_data_update.gyro_z;
        this.raw_accel_x = raw_data_update.accel_x;
        this.raw_accel_y = raw_data_update.accel_y;
        this.raw_accel_z = raw_data_update.accel_z;
        this.cal_mag_x = raw_data_update.mag_x;
        this.cal_mag_y = raw_data_update.mag_y;
        this.cal_mag_z = raw_data_update.mag_z;
        this.mpu_temp_c = raw_data_update.temp_c;
    }
}