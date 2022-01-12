@org.junit.Test
public void should_return_root_project_keys_for_user() {
    setupData("should_return_root_project_keys_for_user");
    org.sonar.core.user.AuthorizationDao authorization = new org.sonar.core.user.AuthorizationDao(getMyBatis());
    java.util.Collection<java.lang.String> rootProjectIds = authorization.selectAuthorizedRootProjectsKeys(org.sonar.core.user.AuthorizationDaoTest.USER, "user");
    org.assertj.core.api.Assertions.assertThat(rootProjectIds).containsOnly(org.sonar.core.user.AuthorizationDaoTest.PROJECT);
    rootProjectIds = authorization.selectAuthorizedRootProjectsKeys(org.sonar.core.user.AuthorizationDaoTest.USER, "admin");
    org.assertj.core.api.Assertions.assertThat(rootProjectIds).isEmpty();
}