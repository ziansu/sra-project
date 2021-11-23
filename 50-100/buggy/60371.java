protected void payRecurring(org.avr.simplecheckbook.dataobjects.RecurringPymt pymt) throws org.avr.simplecheckbook.utils.IncalculableDueDate {
    org.avr.simplecheckbook.dataobjects.Transaction t = new org.avr.simplecheckbook.dataobjects.Transaction();
    t.setTxDate(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
    t.setPayee(pymt.getPayTo());
    t.setDebit(pymt.getAmount());
    t.setMemo(("DUE : " + (pymt.dueDate())));
    t.setRecurId(pymt.getId());
    processTransaction(t);
}