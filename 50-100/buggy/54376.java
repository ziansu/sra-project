@org.junit.Test
public void defaultLabel() throws java.lang.Exception {
    java.lang.String uri = org.springframework.cloud.config.server.test.ConfigServerTestUtils.prepareLocalRepo();
    this.context = new org.springframework.boot.builder.SpringApplicationBuilder(org.springframework.cloud.config.server.environment.JGitEnvironmentRepositoryIntegrationTests.TestConfiguration.class).web(false).properties(("spring.cloud.config.server.git.uri:" + uri)).run();
    org.springframework.cloud.config.server.environment.JGitEnvironmentRepository repository = this.context.getBean(org.springframework.cloud.config.server.environment.JGitEnvironmentRepository.class);
    org.junit.Assert.assertEquals("master", repository.getDefaultLabel());
}