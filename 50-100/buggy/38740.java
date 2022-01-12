@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = JtaProperties.PREFIX)
public org.springframework.context.annotation.Configuration bitronixConfiguration(org.springframework.boot.autoconfigure.jta.JtaProperties xxx) {
    org.springframework.context.annotation.Configuration config = bitronix.tm.TransactionManagerServices.getConfiguration();
    config.setServerId("spring-boot-jta-bitronix");
    java.io.File logBaseDir = getLogBaseDir();
    config.setLogPart1Filename(new java.io.File(logBaseDir, "part1.btm").getAbsolutePath());
    config.setLogPart2Filename(new java.io.File(logBaseDir, "part2.btm").getAbsolutePath());
    config.setDisableJmx(true);
    return config;
}