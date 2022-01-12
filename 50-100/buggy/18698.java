public void statusCheck() {
    au.gov.qld.pub.orders.service.ScheduleService.LOG.info("Scheduled task: {} starting", "statusCheck");
    java.util.Date minCreated = new org.joda.time.LocalDateTime().minusMillis(maxAge).toDate();
    for (java.lang.String orderId : orderService.findUnpaidOrderIds(minCreated)) {
        try {
            orderService.notifyPayment(orderId);
            notifyService.send(orderId);
        } catch (au.gov.qld.pub.orders.service.ServiceException e) {
            au.gov.qld.pub.orders.service.ScheduleService.LOG.info(e.getMessage(), e);
        }
    }
    au.gov.qld.pub.orders.service.ScheduleService.LOG.info("Scheduled task: {} finished", "statusCheck");
}