private java.lang.String getLayoutName(java.lang.Object handler) {
    if (handler instanceof org.springframework.web.method.HandlerMethod) {
        org.springframework.web.method.HandlerMethod handlerMethod = ((org.springframework.web.method.HandlerMethod) (handler));
        org.thymeleaf.spring.support.Layout layout = getMethodOrTypeAnnotation(handlerMethod);
        if (layout != null) {
            return layout.value();
        }
    }
    return this.defaultLayout;
}