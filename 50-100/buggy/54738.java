@java.lang.Override
public void addResourceHandlers(ru.kadyrov.electron.commerce.config.ResourceHandlerRegistry registry) {
    if (!(registry.hasMappingForPattern("/webjars/**"))) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
    registry.addResourceHandler("/js/**").addResourceLocations("/js/");
    registry.addResourceHandler("/partials/**").addResourceLocations("/partials/");
    registry.addResourceHandler("/data/**").addResourceLocations("/data/");
    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
}