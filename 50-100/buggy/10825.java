@org.junit.Test
public void should_return_root_project_uuids_for_group() {
    setupData("should_return_root_project_keys_for_group");
    org.sonar.core.user.AuthorizationDao authorization = new org.sonar.core.user.AuthorizationDao(getMyBatis());
    java.util.Collection<java.lang.String> rootProjectUuids = authorization.selectAuthorizedRootProjectsUuids(org.sonar.core.user.AuthorizationDaoTest.USER, "user");
    org.assertj.core.api.Assertions.assertThat(rootProjectUuids).containsOnly("ABCD");
    rootProjectUuids = authorization.selectAuthorizedRootProjectsKeys(org.sonar.core.user.AuthorizationDaoTest.USER, "admin");
    org.assertj.core.api.Assertions.assertThat(rootProjectUuids).isEmpty();
}