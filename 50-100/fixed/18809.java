public org.egov.demand.model.EgDemand getCurrentDemand(final java.lang.Long billId) {
    final org.egov.demand.model.EgBill egBill = egBillDAO.findById(billId, false);
    final org.egov.demand.model.EgDemand egDemand = connectionDemandService.getDemandByInstAndApplicationNumber(connectionDemandService.getCurrentInstallment(WaterTaxConstants.EGMODULE_NAME, WaterTaxConstants.YEARLY, new java.util.Date()), egBill.getConsumerId());
    return egDemand;
}