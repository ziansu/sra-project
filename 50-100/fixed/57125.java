private boolean bookRenewalPeriodExpired(wsdc.devathon17.models.BookIssue bookIssue) {
    java.util.Calendar dueDate = java.util.Calendar.getInstance();
    dueDate.setTime(bookIssue.getDoi());
    dueDate.add(java.util.Calendar.DATE, 30);
    java.util.Calendar today = java.util.Calendar.getInstance();
    today.setTime(new java.util.Date());
    if (today.after(dueDate))
        return true;
    else
        return false;
    
}