@java.lang.Override
public void setModeDehumid(boolean modeDehumid) {
    int mask = 1 << 1;
    int tempRegister = modbusSlave.getResgister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)));
    if (modeDehumid) {
        tempRegister |= mask;
    }else {
        mask = ~mask;
        mask &= 255;
        tempRegister &= mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
}