@java.lang.Override
public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
    registry.addMapping("/**").allowedMethods("PUT", "DELETE", "POST", "GET").allowedOrigins("*").allowCredentials(false).maxAge(3600);
}