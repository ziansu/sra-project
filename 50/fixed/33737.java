@org.junit.Test
public void should_return_global_permissions_for_group_anyone() throws java.lang.Exception {
    setupData("should_return_global_permissions_for_group_anyone");
    org.assertj.core.api.Assertions.assertThat(authorization.selectGlobalPermissions("anyone_user")).containsOnly("user", "profileadmin");
}