@javax.ws.rs.Path(value = "expensecategory/")
@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
public com.slabs.expense.tracker.webservice.response.Response getExpenseCategory(@javax.ws.rs.QueryParam(value = "categoryId")
java.lang.Integer categoryId) throws com.slabs.expense.tracker.core.exception.ExpenseTrackerException {
    try {
        com.slabs.expense.tracker.core.services.ExpenseCategoryService service = com.slabs.expense.tracker.core.ServiceFactory.getInstance().getService(Services.EXPENSE_CATEGORY_SERVICE, com.slabs.expense.tracker.core.services.ExpenseCategoryService.class);
        return service.select(categoryId);
    } catch (java.lang.Exception e) {
        com.slabs.expense.tracker.core.web.services.ExpenseWebService.L.error("Exception occurred, {}", e);
        throw new com.slabs.expense.tracker.core.exception.ExpenseTrackerException(e, com.slabs.expense.tracker.core.ResponseStatus.SERVER_ERROR);
    }
}