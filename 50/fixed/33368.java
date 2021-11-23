@org.junit.Test
public void testSave() throws java.lang.Exception {
    ru.fil7.test.hello.user.model.User newUser = getNewUser();
    ru.fil7.test.hello.user.model.User created = service.save(newUser);
    newUser.setId(created.getId());
    org.junit.Assert.assertEquals(newUser, created);
}