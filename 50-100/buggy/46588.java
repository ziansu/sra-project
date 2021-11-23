public boolean insertWorkshopBill(org.camunda.bpm.engine.delegate.DelegateExecution delegateExecution) {
    java.util.Map<java.lang.String, java.lang.Object> variables = delegateExecution.getVariables();
    double repairBill = java.lang.Double.parseDouble(((java.lang.String) (variables.get("repairBill"))));
    org.camunda.bpm.bvis.entities.Claim claim = claimService.getClaim(((long) (variables.get("claimID"))));
    claim.setWorkshopPrice(new java.math.BigDecimal(repairBill));
    claimService.updateClaim(claim);
    return true;
}