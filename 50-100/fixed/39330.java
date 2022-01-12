@java.lang.Override
public void setModeDehumid(boolean modeDehumid) {
    final int mask = 1 << 1;
    int tempRegister = getPanelStatus(room);
    int tempBackRegister = getPanelBackupStatus(room);
    if (modeDehumid) {
        tempRegister |= mask;
        tempBackRegister |= mask;
    }else {
        tempRegister &= mask;
        tempBackRegister &= mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
    setPanelBackup(tempBackRegister, room, edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS);
}