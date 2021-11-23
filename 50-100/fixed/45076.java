@java.lang.Override
protected org.camunda.bpm.engine.impl.javax.el.ELResolver createElResolver() {
    org.camunda.bpm.engine.impl.javax.el.CompositeELResolver compositeElResolver = new org.camunda.bpm.engine.impl.javax.el.CompositeELResolver();
    compositeElResolver.add(new org.camunda.bpm.engine.impl.el.VariableScopeElResolver());
    compositeElResolver.add(new org.camunda.bpm.engine.impl.javax.el.ArrayELResolver());
    compositeElResolver.add(new org.camunda.bpm.engine.impl.javax.el.ListELResolver());
    compositeElResolver.add(new org.camunda.bpm.engine.impl.javax.el.MapELResolver());
    compositeElResolver.add(new org.camunda.bpm.extension.osgi.el.OSGiELResolver());
    return compositeElResolver;
}