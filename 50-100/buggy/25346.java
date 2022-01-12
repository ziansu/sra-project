@java.lang.Override
public <T> T get(javax.enterprise.context.spi.Contextual<T> contextual) {
    javax.enterprise.inject.spi.Bean bean = ((javax.enterprise.inject.spi.Bean) (contextual));
    if (angularBeans.context.NGSessionScopeContext.holder.getBeans().containsKey(bean.getBeanClass())) {
        return ((T) (angularBeans.context.NGSessionScopeContext.holder.getBean(bean.getBeanClass()).instance));
    }else {
        return null;
    }
}