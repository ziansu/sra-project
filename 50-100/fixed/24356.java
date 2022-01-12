@java.lang.Override
public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("platform");
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/register").setViewName("register");
    registry.addViewController("/in").setViewName("platform");
    registry.addViewController("/error").setViewName("error");
}