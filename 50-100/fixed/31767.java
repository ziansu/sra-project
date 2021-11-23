@org.springframework.scheduling.annotation.Scheduled(cron = "0/10 * * * * ? ")
public void run() {
    java.util.List<com.order.www.domain.db.OrderDB> orderDBS = orderService.listEmptyOrder();
    for (com.order.www.domain.db.OrderDB orderDB : orderDBS) {
        java.lang.Integer isSyncing = orderDB.getSeller().getIsSyncing();
        if ((isSyncing == null) || (isSyncing == 0)) {
            orderService.delete(orderDB);
        }
    }
}