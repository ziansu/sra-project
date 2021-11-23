@org.junit.Test
public void testShouldNotGetNestedGroups() {
    com.dtolabs.rundeck.jetty.jaas.JettyCachingLdapLoginModule module = getJettyCachingLdapLoginModule(false);
    try {
        org.eclipse.jetty.plus.jaas.spi.UserInfo userInfo = module.getUserInfo(user1);
        org.junit.Assert.assertThat(userInfo.getUserName(), org.hamcrest.CoreMatchers.is(user1));
        java.util.List<java.lang.String> actualRoles = userInfo.getRoleNames();
        java.util.List<java.lang.String> expectedRoles = java.util.Arrays.asList(role1, role2);
        org.junit.Assert.assertThat(actualRoles, org.hamcrest.CoreMatchers.is(expectedRoles));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}