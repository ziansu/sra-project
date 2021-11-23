protected void findBeans(org.springframework.context.ConfigurableApplicationContext ctx) {
    launcher = ctx.getBean(org.springframework.batch.core.launch.JobLauncher.class);
    locator = ctx.getBean(org.springframework.batch.core.configuration.JobLocator.class);
    operator = ctx.getBean(org.springframework.batch.core.launch.JobOperator.class);
    try {
        parametersConverter = ctx.getBean(org.springframework.batch.core.converter.JobParametersConverter.class);
    } catch (org.springframework.beans.factory.NoSuchBeanDefinitionException e) {
        parametersConverter = new org.springframework.batch.core.converter.DefaultJobParametersConverter();
    }
}