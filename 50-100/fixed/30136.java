private com.clouway.adapter.http.ExpensesPage mockExpenses(final com.clouway.adapter.rest.Expense expenses) {
    com.clouway.adapter.http.ExpensesPage page = new com.clouway.adapter.http.ExpensesPage(com.google.inject.util.Providers.of(repository));
    context.checking(new org.jmock.Expectations() {
        {
            oneOf(request).read(com.clouway.adapter.rest.Expense.class);
            will(returnValue(requestRead));
            oneOf(requestRead).as(com.google.sitebricks.client.transport.Json.class);
            will(returnValue(expenses));
        }
    });
    return page;
}