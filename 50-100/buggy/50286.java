@org.junit.Test
public void happyPath() {
    addExpenses(new com.clouway.adapter.rest.Expense("women", "51"), new com.clouway.adapter.rest.Expense("cars", "1"), new com.clouway.adapter.rest.Expense("girls", "4"));
    com.clouway.adapter.http.HistoryExpensesPage historyExpensesPage = new com.clouway.adapter.http.HistoryExpensesPage(com.google.inject.util.Providers.of(repository));
    historyExpensesPage.getItems(2, 2);
    java.util.List<com.clouway.adapter.rest.Expense> one = repository.find(1, 2);
    assertThat(one.size(), org.hamcrest.core.Is.is(1));
}