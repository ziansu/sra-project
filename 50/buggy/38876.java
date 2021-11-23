@java.lang.SuppressWarnings(value = "unchecked")
private void recreateCheckList(final org.egov.model.bills.EgBillregister bill) {
    final java.util.List<org.egov.infstr.models.EgChecklists> checkLists = persistenceService.findAllBy("from org.egov.infstr.models.EgChecklists where objectid=?", billRegisterId);
    for (final org.egov.infstr.models.EgChecklists chk : checkLists)
        persistenceService.delete(chk);
    
    createCheckList(bill);
}