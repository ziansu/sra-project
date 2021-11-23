@org.junit.Test
public void shouldOnlyBook1InResult() {
    java.util.List<cn.jimmyshi.beanquery.example.Book> result = select(cn.jimmyshi.beanquery.example.Book.class).from(mainData).where(value("name", is("Book1"))).execute();
    org.junit.Assert.assertThat(result, hasSize(1));
    org.junit.Assert.assertThat(result.get(0).getName(), is("Book1"));
}