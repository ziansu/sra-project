public org.springframework.beans.factory.config.BeanDefinitionHolder registerDefaultTemplate(org.springframework.beans.factory.support.BeanDefinitionRegistry registry, java.lang.String sessionBeanName, java.lang.String converterBeanName) {
    org.springframework.beans.factory.support.BeanDefinitionBuilder templateBeanDefinitionBuilder = org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition(org.springframework.data.cassandra.core.CassandraTemplate.class).addConstructorArgReference(sessionBeanName).addConstructorArgReference(converterBeanName);
    org.springframework.beans.factory.config.BeanDefinition beanDefinition = templateBeanDefinitionBuilder.getBeanDefinition();
    org.springframework.beans.factory.config.BeanDefinitionHolder template = new org.springframework.beans.factory.config.BeanDefinitionHolder(beanDefinition, DefaultBeanNames.TEMPLATE);
    registry.registerBeanDefinition(template.getBeanName(), template.getBeanDefinition());
    return template;
}