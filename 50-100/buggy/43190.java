void afterBeanDiscovery(@javax.enterprise.event.Observes
javax.enterprise.inject.spi.AfterBeanDiscovery event, javax.enterprise.inject.spi.BeanManager beanManager) {
    org.juzu.impl.spi.inject.cdi.Container container = Container.boot.get();
    for (org.juzu.impl.request.Scope scope : container.scopes) {
        event.addContext(new org.juzu.impl.spi.inject.cdi.ContextImpl(container.scopeController, scope, scope.getAnnotationType()));
    }
    event.addBean(new org.juzu.impl.spi.inject.cdi.InstanceBean(org.juzu.impl.spi.inject.InjectManager.class, org.juzu.impl.utils.Tools.set(AbstractBean.DEFAULT_QUALIFIER, AbstractBean.ANY_QUALIFIER), manager));
    for (org.juzu.impl.spi.inject.cdi.AbstractBean bean : manager.boundBeans.values()) {
        event.addBean(bean);
    }
}