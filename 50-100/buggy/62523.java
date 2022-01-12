public static java.util.Map<java.lang.Integer, java.lang.Integer> initStatus() {
    io.anyway.galaxy.scheduler.TransactionRecoveryJob.statusMap = new java.util.HashMap<java.lang.Integer, java.lang.Integer>();
    io.anyway.galaxy.scheduler.TransactionRecoveryJob.statusMap.put(0, TransactionStatusEnum.BEGIN.getCode());
    io.anyway.galaxy.scheduler.TransactionRecoveryJob.statusMap.put(1, TransactionStatusEnum.CANCELLING.getCode());
    io.anyway.galaxy.scheduler.TransactionRecoveryJob.statusMap.put(2, TransactionStatusEnum.CONFIRMING.getCode());
    return io.anyway.galaxy.scheduler.TransactionRecoveryJob.statusMap;
}