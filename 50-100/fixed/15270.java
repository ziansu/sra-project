public boolean add(statistic.dto.TransactionDTO trDto) {
    long now = java.lang.System.currentTimeMillis();
    if (((now - (trDto.getTimestamp())) > (EXPIRE_TIME_IN_MILLIS)) || (now < (trDto.getTimestamp()))) {
        return false;
    }
    data.add(new statistic.model.Data(trDto));
    log();
    stats.addNew(trDto.getAmount());
    log();
    return true;
}