private void setMode(int mode) {
    org.team2168.utils.BNO055._mode = mode;
    write8(org.team2168.utils.BNO055.reg_t.BNO055_OPR_MODE_ADDR, ((byte) (org.team2168.utils.BNO055._mode)));
}