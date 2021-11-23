@java.lang.Override
public com.constellio.app.services.factories.ConstellioFactories get() {
    com.constellio.app.services.factories.ConstellioFactories instance = com.constellio.app.services.factories.ConstellioFactories.buildFor(propertyFile, decorator, null);
    instance.appLayerFactory.initialize();
    return instance;
}