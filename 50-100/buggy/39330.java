@java.lang.Override
public void setModeDehumid(boolean modeDehumid) {
    int mask = 1 << 1;
    int tempRegister = getPanelStatus(room);
    int tempBackRegister = getPanelBackupStatus(room);
    if (modeDehumid) {
        tempRegister |= mask;
        tempBackRegister |= mask;
    }else {
        mask = ~mask;
        mask &= 255;
        tempRegister &= mask;
        tempBackRegister &= mask;
    }
    modbusSlave.setRegister(((edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS) + (offset)), tempRegister);
    setPanelBackup(tempBackRegister, room, edu.ncku.uscc.util.DataStoreManager.ADDR_STATUS);
}