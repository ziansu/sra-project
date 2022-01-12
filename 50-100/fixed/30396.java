@org.springframework.context.annotation.Bean
public com.ftzen.spring.metrics.config.ContainerPrefix metricSuffix() {
    com.ftzen.spring.metrics.config.ContainerPrefix containerPrefix = new com.ftzen.spring.metrics.config.ContainerPrefix();
    java.lang.String containerId = env.getProperty("HOSTNAME");
    if (org.springframework.util.StringUtils.hasText(containerId)) {
        containerPrefix.setPrefixValue(containerId);
        containerPrefix.setHasPrefix(true);
    }
    return containerPrefix;
}