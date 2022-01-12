public java.lang.String START_TX() {
    if (hih.hihUtil.DEBUG) {
        hih.hihUtil.logWriter.printf("START_TRANSACTION \n");
    }
    return hih.startTransaction();
}