@org.junit.Test
public void findSingleWithFetch() {
    org.tests.model.basic.ResetBasicData.reset();
    io.ebean.Query<org.tests.model.basic.Customer> query = io.ebean.Ebean.find(org.tests.model.basic.Customer.class).fetch("billingAddress", "city");
    java.util.List<java.lang.String> cities = query.findSingleAttributeList();
    org.assertj.core.api.Assertions.assertThat(cities).contains("Auckland").containsNull();
    org.assertj.core.api.Assertions.assertThat(sqlOf(query)).contains("select t1.city from o_customer t0 left join o_address t1 on t1.id = t0.billing_address_id");
}