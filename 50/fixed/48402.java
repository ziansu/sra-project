@java.lang.Override
public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    registry.addInterceptor(new io.github.jetqin.config.interceptor.DruidHandler()).addPathPatterns("/druid/**");
}