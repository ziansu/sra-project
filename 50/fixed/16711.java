@com.somecode.config.Bean
public org.springframework.web.servlet.ViewResolver viewResolver() {
    org.springframework.web.servlet.view.UrlBasedViewResolver urlBasedViewResolver = new org.springframework.web.servlet.view.UrlBasedViewResolver();
    urlBasedViewResolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
    return urlBasedViewResolver;
}