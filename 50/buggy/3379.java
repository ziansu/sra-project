@java.lang.Override
public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
    registry.addMapping("/**").allowedMethods("PUT", "DELETE", "POST", "GET").allowedHeaders("Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With").allowedOrigins("*").allowCredentials(false).maxAge(3600);
}