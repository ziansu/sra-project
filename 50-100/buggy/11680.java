@java.lang.Override
public <T> T getService(org.terracotta.entity.ServiceConfiguration<T> configuration) {
    T builtInService = (null != (this.owningEntity)) ? getBuiltInService(configuration) : null;
    T externalService = getExternalService(configuration);
    com.tc.util.Assert.assertFalse(((null != builtInService) && (null != externalService)));
    return null != builtInService ? builtInService : externalService;
}