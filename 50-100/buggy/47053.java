public void setMagScale(int mScl) {
    MagSettings.CTRL_REG2_MVal &= 255 ^ (3 << 5);
    switch (mScl) {
        case 8 :
            MagSettings.CTRL_REG2_MVal |= 1 << 5;
            MagSettings.scale = 8;
            break;
        case 12 :
            MagSettings.CTRL_REG2_MVal |= 2 << 5;
            MagSettings.scale = 12;
            break;
        case 16 :
            MagSettings.CTRL_REG2_MVal |= 3 << 5;
            MagSettings.scale = 16;
            break;
        default :
            MagSettings.scale = 4;
            break;
    }
    mWriteByte(com.ociweb.iot.astropi.CTRL_REG2_M, MagSettings.CTRL_REG2_MVal);
    target.i2cFlushBatch();
    calcmRes();
}