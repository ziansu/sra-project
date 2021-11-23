@java.lang.Override
public void addFormatters(org.springframework.format.FormatterRegistry registry) {
    com.vincent.SSHProject.configuration.AppConfig.logger.info("AppConfig - addFormatter");
    registry.addConverter(roleToUserProfileConverter);
}