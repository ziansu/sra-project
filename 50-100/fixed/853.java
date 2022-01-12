@java.lang.Override
public java.lang.Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
    if (bean instanceof org.springframework.integration.dsl.StandardIntegrationFlow) {
        return processStandardIntegrationFlow(((org.springframework.integration.dsl.StandardIntegrationFlow) (bean)), beanName);
    }else
        if (bean instanceof org.springframework.integration.dsl.IntegrationFlow) {
            processIntegrationFlowImpl(((org.springframework.integration.dsl.IntegrationFlow) (bean)), beanName);
        }
    
    if (bean instanceof org.springframework.integration.dsl.core.IntegrationComponentSpec) {
        processIntegrationComponentSpec(((org.springframework.integration.dsl.core.IntegrationComponentSpec<?, ?>) (bean)));
    }
    return bean;
}