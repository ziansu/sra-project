@org.junit.Test
public void shouldKeepPreconfiguredProjectionsAcrossRestart() throws java.lang.Exception {
    org.modeshape.jcr.ModeshapePersistenceIT.RepositoryOperation checkPreconfiguredProjection = ( repository) -> {
        javax.jcr.Session session = repository.login();
        org.junit.Assert.assertNotNull(session.getNode("/preconfiguredProjection"));
    };
    startRunStop(checkPreconfiguredProjection, true, false);
    startRunStop(checkPreconfiguredProjection, false, true);
}