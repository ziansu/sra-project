@java.lang.Override
public void setOn(boolean onoff) {
    final int mask = 1 << 0;
    int tempRegister = modbusSlave.getResgister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)));
    if (onoff) {
        tempRegister |= mask;
    }else {
        tempRegister &= ~mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
}