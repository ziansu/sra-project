@dagger.Provides
@javax.inject.Singleton
@com.palantir.atlasdb.timelock.server.modules.qualifiers.Remote
public java.util.Set<java.lang.String> provideRemoteLeaders(com.palantir.atlasdb.config.LeaderConfig config) {
    return config.leaders().stream().filter(java.util.function.Predicate.isEqual(config.localServer().get()).negate()).collect(java.util.stream.Collectors.toSet());
}