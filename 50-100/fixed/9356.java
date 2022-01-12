@java.lang.Override
public io.subutai.common.environment.Environment loadEnvironment(final java.lang.String environmentId) throws io.subutai.common.environment.EnvironmentNotFoundException {
    com.google.common.base.Preconditions.checkNotNull(environmentId, "Invalid environment id");
    io.subutai.core.environment.impl.entity.EnvironmentImpl environment = environmentAdapter.get(environmentId);
    if (environment != null) {
        return environment;
    }
    environment = environmentService.find(environmentId);
    if (environment != null) {
        setTransientFields(com.google.common.collect.Sets.<io.subutai.common.environment.Environment>newHashSet(environment));
        return environment;
    }
    throw new io.subutai.common.environment.EnvironmentNotFoundException();
}