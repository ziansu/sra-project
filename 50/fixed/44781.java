@java.lang.Override
public void addResourceHandlers(com.litrum.webproject.config.ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/");
}