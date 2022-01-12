@java.lang.Override
public void addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
    int cachePeriod = (3600 * 24) * 15;
    registry.addResourceHandler("/*.html").addResourceLocations("/").setCachePeriod(cachePeriod);
    registry.addResourceHandler("/favicon.ico").addResourceLocations("/").setCachePeriod(cachePeriod);
    registry.addResourceHandler("/robots.txt").addResourceLocations("/").setCachePeriod(cachePeriod);
    registry.addResourceHandler("/bower_components/**").addResourceLocations("/bower_components/");
}