@java.lang.Override
public void setHumidWarn(boolean HumidWarn) {
    final int mask = 1 << 7;
    int tempRegister = modbusSlave.getResgister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)));
    if (HumidWarn) {
        tempRegister |= mask;
    }else {
        tempRegister &= ~mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
}