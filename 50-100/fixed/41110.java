@org.junit.Test
public void test() {
    try {
        com.hust.bill.electric.core.task.consume.ConsumeCalculateTask calculateTask = new com.hust.bill.electric.core.task.consume.ConsumeCalculateTask(consumeService, buildingService, roomService, recordService);
        calculateTask.create();
        java.lang.Thread t = new java.lang.Thread(calculateTask);
        t.start();
        while (true) {
            java.lang.Thread.sleep(1000);
        } 
    } catch (org.springframework.dao.DataAccessException e) {
        e.printStackTrace();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
    }
}