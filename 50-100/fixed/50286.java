@org.junit.Test
public void happyPath() {
    addExpenses(new com.clouway.adapter.rest.Expense("women", "51"), new com.clouway.adapter.rest.Expense("cars", "1"), new com.clouway.adapter.rest.Expense("girls", "4"));
    java.util.List<com.clouway.adapter.rest.Expense> one = repository.find(1, 2);
    assertThat(one.size(), org.hamcrest.core.Is.is(1));
}