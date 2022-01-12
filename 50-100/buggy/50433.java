@org.junit.Test
public void should_return_root_project_keys_for_anonymous() {
    setupData("should_return_root_project_keys_for_anonymous");
    org.sonar.core.user.AuthorizationDao authorization = new org.sonar.core.user.AuthorizationDao(getMyBatis());
    java.util.Collection<java.lang.String> rootProjectIds = authorization.selectAuthorizedRootProjectsKeys(null, "user");
    org.assertj.core.api.Assertions.assertThat(rootProjectIds).containsOnly(org.sonar.core.user.AuthorizationDaoTest.PROJECT);
    rootProjectIds = authorization.selectAuthorizedRootProjectsKeys(null, "admin");
    org.assertj.core.api.Assertions.assertThat(rootProjectIds).isEmpty();
}