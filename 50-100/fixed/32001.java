@org.junit.Test
public void testFindAllByLastUpdatedGreaterThan() throws java.lang.Exception {
    juja.microservices.users.dao.crm.domain.UserCRM expected = new juja.microservices.users.dao.crm.domain.UserCRM(3L, "Sergey", "Spiderman", "Sergey", 250L, "sergey.spiderman", 1, "00000000-0000-0001-0000-000000000004");
    java.util.List<juja.microservices.users.dao.crm.domain.UserCRM> users = crmRepository.findUpdatedUsers(220L);
    org.junit.Assert.assertEquals(1, users.size());
    org.junit.Assert.assertEquals(expected, users.get(0));
}