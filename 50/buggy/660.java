@java.lang.Override
public void addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
    com.vincent.SSHProject.configuration.AppConfig.logger.info("AppConfig - addResourceHandlers");
    registry.addResourceHandler("/static/**").addResourceLocations("/static/");
}