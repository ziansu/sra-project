public boolean isEffectiveComputer() {
    if ((mComputerTable) == null) {
        mComputerTable = new com.mephone.fontello.table.ComputerTable();
    }
    java.lang.String mac = com.mephone.fontello.util.CommonUtils.getLocalMac();
    return mComputerTable.isEffectiveComputer(mac);
}