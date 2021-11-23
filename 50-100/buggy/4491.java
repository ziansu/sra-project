@java.lang.Override
public void postProcessBeanDefinitionRegistry(org.springframework.beans.factory.support.BeanDefinitionRegistry registry) throws org.springframework.beans.BeansException {
    if (!(registry.containsBeanDefinition(SpringConstants.HTTP_TRANSPORT))) {
        registerBeanDefinition(registry, SpringConstants.HTTP_TRANSPORT, org.wso2.msf4j.spring.transport.HTTPTransportConfig.class);
    }
    if (!(registry.containsBeanDefinition(SpringConstants.HTTPS_TRANSPORT))) {
        registerBeanDefinition(registry, SpringConstants.HTTP_TRANSPORT, org.wso2.msf4j.spring.transport.HTTPSTransportConfig.class);
    }
}