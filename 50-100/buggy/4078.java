public <L, F extends de.factoryfx.factory.FactoryBase<L, V>> void addFactory(java.lang.Class<F> clazz, de.factoryfx.factory.builder.Scope scope, java.util.function.Function<de.factoryfx.factory.builder.FactoryContext<V>, F> creator) {
    factoryContext.addFactoryCreator(new de.factoryfx.factory.builder.FactoryCreator(clazz, "", scope, creator));
}