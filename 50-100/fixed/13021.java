@org.junit.Test
public void getListUser() {
    java.util.List<com.ca.devtest.lisabank.wsdl.User> users = bankServices.getListUserWithoutAdmin();
    org.junit.Assert.assertNotNull(users);
    org.junit.Assert.assertEquals("Il y a plus de 7 utilisateurs, le webservice \"userControl\" ne sont pas correctement configur\u00e9", 6, users.size());
    org.junit.Assert.assertNotEquals("Admin", users.get(0).getLname());
}