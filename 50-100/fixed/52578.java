public void closeCashRegister(com.axelor.rpc.ActionRequest request, com.axelor.rpc.ActionResponse response) {
    com.axelor.apps.account.db.CashRegisterLine cashRegisterLine = request.getContext().asType(com.axelor.apps.account.db.CashRegisterLine.class);
    cashRegisterLine = cashRegisterLineRepo.find(cashRegisterLine.getId());
    try {
        cashRegisterLineService.closeCashRegister(cashRegisterLine);
        response.setReload(true);
    } catch (java.lang.Exception e) {
        com.axelor.exception.service.TraceBackService.trace(response, e);
    }
}