protected boolean commboxDo(int commandWord, int offset, int count, byte... buff) {
    if ((buff.length) > (D.CMD_DATALEN)) {
        return sendDataToECU(commandWord, offset, count, buff);
    }else {
        return commboxCommand(commandWord, offset, count, buff);
    }
}