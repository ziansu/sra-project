@org.junit.Test
public void should_return_group_global_permissions() {
    setupData("should_return_group_global_permissions");
    org.sonar.core.user.AuthorizationDao authorization = new org.sonar.core.user.AuthorizationDao(getMyBatis());
    org.assertj.core.api.Assertions.assertThat(authorization.selectGlobalPermissions("john")).containsOnly("user", "admin");
    org.assertj.core.api.Assertions.assertThat(authorization.selectGlobalPermissions("arthur")).containsOnly("user");
    org.assertj.core.api.Assertions.assertThat(authorization.selectGlobalPermissions("none")).isEmpty();
}