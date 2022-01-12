private boolean isValidAskReview(java.lang.Long contractorID, java.lang.Long tendererID) {
    com.gdf.persistence.Notification n = ebi.getLastNotificationSent(contractorID, tendererID);
    if (n != null) {
        java.util.Date date = new java.util.Date();
        long current = date.getTime();
        return ((n.getDate().getTime()) + (com.gdf.managedBean.ListTendererBean.INTERVAL)) <= current;
    }
    return true;
}