private org.jboss.errai.ioc.rebind.ioc.graph.api.Injectable registerNewConcreteInjectable(final org.jboss.errai.ioc.rebind.ioc.graph.impl.ConcreteInjectable concrete) {
    final java.lang.String factoryName = concrete.getFactoryName();
    if (concretesByName.containsKey(factoryName)) {
        throwDuplicateConcreteInjectableException(factoryName, concretesByName.get(factoryName), concrete);
    }
    concretesByName.put(factoryName, concrete);
    linkDirectAbstractInjectable(concrete);
    if (concrete.wiringTypes.contains(WiringElementType.Specialization)) {
        specializations.add(concrete);
    }
    return concrete;
}