@java.lang.Override
public <T> T getService(org.terracotta.entity.ServiceConfiguration<T> configuration) {
    T builtInService = getBuiltInService(configuration);
    T externalService = getExternalService(configuration);
    com.tc.util.Assert.assertFalse(((null != builtInService) && (null != externalService)));
    return null != builtInService ? builtInService : externalService;
}