@com.abm.pos.com.abm.pos.controllers.RequestMapping(method = RequestMethod.POST, value = "/addTransactionLineItem", consumes = "application/json")
public void addTransactionLineItem(@com.abm.pos.com.abm.pos.controllers.RequestBody
java.util.List<com.abm.pos.com.abm.pos.dto.TransactionLineItemDto> transactionLineItemDto) {
    salesManager.addTransactionLineItemToDB(transactionLineItemDto);
}