@java.lang.Override
public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    registry.addViewController("/403").setViewName("403");
    registry.addViewController("/admin/users/self").setViewName("admin/dashboard/user/self");
    registry.addViewController("/admin/users/self/avatar").setViewName("admin/fragments/user/avatar::form('/admin/users/self/avatar/upload')");
}