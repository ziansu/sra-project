private java.lang.String getLayoutName(java.lang.Object handler) {
    org.springframework.web.method.HandlerMethod handlerMethod = ((org.springframework.web.method.HandlerMethod) (handler));
    org.thymeleaf.spring.support.Layout layout = getMethodOrTypeAnnotation(handlerMethod);
    if (layout == null) {
        return this.defaultLayout;
    }else {
        return layout.value();
    }
}