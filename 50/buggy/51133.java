@java.lang.Override
public void setBoardState(com.kauailabs.navx.frc.BoardState board_state) {
    synchronized(this) {
        update_rate_hz = board_state.update_rate_hz;
        accel_fsr_g = board_state.accel_fsr_g;
        gyro_fsr_dps = board_state.gyro_fsr_dps;
        capability_flags = board_state.capability_flags;
        op_status = board_state.op_status;
        sensor_status = board_state.sensor_status;
        cal_status = board_state.cal_status;
        selftest_status = board_state.selftest_status;
    }
}