@java.lang.Override
public void setHumidWarn(boolean HumidWarn) {
    final int mask = 1 << 7;
    int tempRegister = getPanelStatus(room);
    int tempBackRegister = getPanelBackupStatus(room);
    if (HumidWarn) {
        tempRegister |= mask;
        tempBackRegister |= mask;
    }else {
        tempRegister &= ~mask;
        tempBackRegister &= ~mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
    setPanelBackup(tempBackRegister, room, edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS);
}