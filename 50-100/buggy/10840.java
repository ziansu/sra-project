public void setAccelScale(int aScl) {
    AccelSettings.CTRL_REG6_XLVal &= 231;
    switch (aScl) {
        case 4 :
            AccelSettings.CTRL_REG6_XLVal |= 2 << 3;
            AccelSettings.scale = 4;
            break;
        case 8 :
            AccelSettings.CTRL_REG6_XLVal |= 3 << 3;
            AccelSettings.scale = 8;
            break;
        case 16 :
            AccelSettings.CTRL_REG6_XLVal |= 1 << 3;
            AccelSettings.scale = 16;
            break;
        default :
            AccelSettings.scale = 2;
            break;
    }
    agWriteByte(com.ociweb.iot.astropi.CTRL_REG6_XL, AccelSettings.CTRL_REG6_XLVal);
    target.i2cFlushBatch();
    calcaRes();
}