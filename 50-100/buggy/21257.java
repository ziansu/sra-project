private boolean isValidAskReview(long contractorID, long tendererID) {
    com.gdf.persistence.Notification n = ebi.getLastNotificationSent(contractorID, tendererID);
    if (n != null) {
        java.util.Date date = new java.util.Date();
        long current = date.getTime();
        return ((n.getDate().getTime()) + (com.gdf.managedBean.ListTendererBean.INTERVAL)) <= current;
    }
    return true;
}