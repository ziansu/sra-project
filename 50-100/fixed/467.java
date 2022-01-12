public org.team2168.utils.BNO055.SystemStatus getSystemStatus() throws java.lang.InterruptedException {
    org.team2168.utils.BNO055.SystemStatus status = new org.team2168.utils.BNO055.SystemStatus();
    write8(org.team2168.utils.BNO055.reg_t.BNO055_PAGE_ID_ADDR, ((byte) (0)));
    status.system_status = read8(org.team2168.utils.BNO055.reg_t.BNO055_SYS_STAT_ADDR);
    status.self_test_result = read8(org.team2168.utils.BNO055.reg_t.BNO055_SELFTEST_RESULT_ADDR);
    status.system_error = read8(org.team2168.utils.BNO055.reg_t.BNO055_SYS_ERR_ADDR);
    return status;
}