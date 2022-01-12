@javax.ws.rs.Path(value = "expensecategory/")
@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
public com.slabs.expense.tracker.webservice.response.Response insertExpenseCategory(java.util.List<com.slabs.expense.tracker.common.db.entity.ExpenseCategory> records) throws com.slabs.expense.tracker.core.exception.ExpenseTrackerException {
    try {
        com.slabs.expense.tracker.core.services.ExpenseCategoryService service = com.slabs.expense.tracker.core.ServiceFactory.getInstance().getService(Services.EXPENSE_CATEGORY_SERVICE, com.slabs.expense.tracker.core.services.ExpenseCategoryService.class);
        return com.slabs.expense.tracker.core.ResponseGenerator.getSucessResponse(service.insert(records), Operation.INSERT);
    } catch (java.lang.Exception e) {
        com.slabs.expense.tracker.core.web.services.ExpenseWebService.L.error("Exception occurred, {}", e);
        throw new com.slabs.expense.tracker.core.exception.ExpenseTrackerException(e, com.slabs.expense.tracker.core.ResponseStatus.SERVER_ERROR);
    }
}