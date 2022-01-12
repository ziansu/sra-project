@org.junit.Test
public void TestManagerBean() throws java.lang.Exception {
    model.UserManagerBean userManagerBean = new model.UserManagerBean();
    model.User user = new model.User();
    user.setId(10L);
    user.setName("bero");
    user.setPhoneNumber("598900310");
    user.setBirthDate("19/50/2016");
    user.setIdScan(new byte[5]);
    user.setAddress("Muxiani");
    model.User mergedUser = userManagerBean.updateUser(user);
    org.junit.Assert.assertEquals("bero", mergedUser.getName());
}