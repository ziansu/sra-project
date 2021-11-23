@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.ViewResolver viewResolver() {
    org.springframework.web.servlet.view.InternalResourceViewResolver resolver = new org.springframework.web.servlet.view.InternalResourceViewResolver();
    resolver.setSuffix("/WEB-INF/views/");
    resolver.setPrefix(".jsp");
    resolver.setExposeContextBeansAsAttributes(true);
    return resolver;
}