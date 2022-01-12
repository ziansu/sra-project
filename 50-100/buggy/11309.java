@org.junit.Test
public void addInvalidFunds() {
    final com.clouway.adapter.rest.Expense expenses = new com.clouway.adapter.rest.Expense("type", "invalid funds");
    com.clouway.adapter.http.ExpensesPage page = mockExpenses(expenses);
    com.clouway.adapter.jdbc.ExpensesRepository repository = new com.clouway.adapter.jdbc.PersistenceExpensesRepository(com.google.inject.util.Providers.of(service));
    page.add(request);
    java.util.List<com.clouway.adapter.rest.Expense> one = repository.find(1, 1);
    assertTrue(one.isEmpty());
}