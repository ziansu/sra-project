@java.lang.Override
public void change(java.lang.Object currentValue, java.lang.Object newValue) {
    final com.orientechnologies.orient.core.engine.local.OEngineLocalPaginated engineLocalPaginated = ((com.orientechnologies.orient.core.engine.local.OEngineLocalPaginated) (com.orientechnologies.orient.core.Orient.instance().getEngine(OEngineLocalPaginated.NAME)));
    if (engineLocalPaginated != null) {
        engineLocalPaginated.changeCacheSize(((((java.lang.Integer) (newValue)) * 1024L) * 1024L));
    }
}