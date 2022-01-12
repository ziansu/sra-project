public void confirm(com.axelor.rpc.ActionRequest request, com.axelor.rpc.ActionResponse response) {
    try {
        com.axelor.apps.bankpayment.db.BankOrder bankOrder = request.getContext().asType(com.axelor.apps.bankpayment.db.BankOrder.class);
        bankOrder = bankOrderRepo.find(bankOrder.getId());
        if (bankOrder != null) {
            bankOrderService.confirm(bankOrder);
            response.setReload(true);
        }
    } catch (java.lang.Exception e) {
        com.axelor.exception.service.TraceBackService.trace(response, e);
    }
}