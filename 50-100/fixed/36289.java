@org.junit.Test
public void getItemsFromNextPage() {
    addExpenses(new com.clouway.adapter.rest.Expense("vacations", "44"), new com.clouway.adapter.rest.Expense("girls", "5"), new com.clouway.adapter.rest.Expense("beer", "999"));
    java.util.List<com.clouway.adapter.rest.Expense> one = repository.find(2, 2);
    assertThat(one.size(), org.hamcrest.core.Is.is(1));
}