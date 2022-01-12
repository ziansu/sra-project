public entities.core.CashierClosures closeCashierRequest(int amount, java.lang.String comment) {
    entities.core.CashierClosures lastCashierClosure = this.getLastCashierClosure();
    lastCashierClosure.setAmount(amount);
    lastCashierClosure.setComment(comment);
    lastCashierClosure.setClosureDate(new java.util.GregorianCalendar());
    cashierClosuresDao.saveAndFlush(lastCashierClosure);
    return lastCashierClosure;
}