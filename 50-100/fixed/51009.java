@org.junit.Test
public void should_return_root_project_uuids_for_anonymous() {
    setupData("should_return_root_project_keys_for_anonymous");
    java.util.Collection<java.lang.String> rootProjectUuids = authorization.selectAuthorizedRootProjectsUuids(null, "user");
    org.assertj.core.api.Assertions.assertThat(rootProjectUuids).containsOnly("ABCD");
    rootProjectUuids = authorization.selectAuthorizedRootProjectsKeys(null, "admin");
    org.assertj.core.api.Assertions.assertThat(rootProjectUuids).isEmpty();
}