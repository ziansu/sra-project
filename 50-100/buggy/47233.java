public static double getTotalDueForCurrentStatus(java.util.Set<com.propmgr.resource.UnitPaymentScheduleResource> scheduleList, double bookingAmount, com.propmgr.dao.Unitbooking unitbooking, int currentStatus) {
    double totalDueForCurrentStatus = bookingAmount;
    for (com.propmgr.resource.UnitPaymentScheduleResource paymentSchedule : scheduleList) {
        if ((paymentSchedule.getPosition()) <= currentStatus) {
            totalDueForCurrentStatus += paymentSchedule.getAmount();
        }
    }
    return totalDueForCurrentStatus;
}