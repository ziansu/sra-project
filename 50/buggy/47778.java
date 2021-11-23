@org.springframework.transaction.annotation.Transactional(rollbackFor = java.lang.Exception.class)
public void run() {
    java.time.LocalDateTime localDateTime = java.time.LocalDateTime.now();
    storeTrainSchedule();
    storeTrainStop();
}