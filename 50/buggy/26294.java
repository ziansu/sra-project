@org.junit.Test
public void updateUserTest() {
    com.zyn.microblog.model.User user = userDAO.selectById(1);
    user.setAddress("abc");
    userDAO.updateUser(user);
    org.junit.Assert.assertEquals("abc", userDAO.selectById(1).getAddress());
}