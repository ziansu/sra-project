private void findBeans(org.springframework.context.ConfigurableApplicationContext ctx) {
    this.launcher = ctx.getBean(org.springframework.batch.core.launch.JobLauncher.class);
    this.locator = ctx.getBean(org.springframework.batch.core.configuration.JobLocator.class);
    this.operator = ctx.getBean(org.springframework.batch.core.launch.JobOperator.class);
    try {
        this.parametersConverter = ctx.getBean(org.springframework.batch.core.converter.JobParametersConverter.class);
    } catch (org.springframework.beans.factory.NoSuchBeanDefinitionException e) {
        this.parametersConverter = new org.springframework.batch.core.converter.DefaultJobParametersConverter();
    }
}