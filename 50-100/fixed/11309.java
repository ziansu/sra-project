@org.junit.Test
public void addInvalidFunds() {
    final com.clouway.adapter.rest.Expense expenses = new com.clouway.adapter.rest.Expense("type", "invalid funds");
    com.clouway.adapter.http.ExpensesPage page = mockExpenses(expenses);
    page.add(request);
    java.util.List<com.clouway.adapter.rest.Expense> one = repository.find(1, 1);
    assertTrue(one.isEmpty());
}