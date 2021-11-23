@java.lang.Override
public void run(final com.github.mtakaki.credentialstorage.CredentialStorageConfiguration configuration, final io.dropwizard.setup.Environment environment) throws java.lang.Exception {
    this.registerExternalDependencies(configuration, environment);
    environment.getObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES).setSerializationInclusion(Include.NON_NULL);
    environment.jersey().register(this.petite.getBean(com.github.mtakaki.credentialstorage.resources.CredentialResource.class));
}