@java.lang.Override
public boolean hasArchetypeCatalogFactories() {
    return ((factories.size()) > 0) || (!(services.isUnsatisfied()));
}