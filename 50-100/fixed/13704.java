@java.lang.Override
public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    registry.addViewController("/home").setViewName("home");
    registry.addViewController("/").setViewName("home");
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/registration").setViewName("/registration");
    registry.addViewController("/account").setViewName("/account");
    registry.addViewController("/purchase").setViewName("/purchase");
}