@java.lang.Override
public void setOn(boolean onoff) {
    final int mask = 1 << 0;
    int tempRegister = getPanelStatus(room);
    int tempBackRegister = getPanelBackupStatus(room);
    if (onoff) {
        tempRegister |= mask;
        tempBackRegister |= mask;
    }else {
        tempRegister &= ~mask;
        tempBackRegister &= ~mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
    setPanelBackup(tempBackRegister, room, edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS);
}