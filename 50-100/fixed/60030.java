@org.junit.Test
public void testUtf8() {
    com.opower.persistence.jpile.sample.Contact expected = com.opower.persistence.jpile.sample.ObjectFactory.newContact();
    expected.setFirstName("\u304c\u3126");
    expected.setLastName("ががががㄦ");
    this.hierarchicalInfileObjectLoader.persist(expected);
    this.hierarchicalInfileObjectLoader.flush();
    java.util.Map<java.lang.String, java.lang.Object> actual = this.jdbcTemplate.queryForMap("select * from contact");
    junit.framework.Assert.assertEquals("がㄦ", actual.get("first_name"));
    junit.framework.Assert.assertEquals("ががががㄦ", actual.get("last_name"));
}