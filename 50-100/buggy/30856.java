public static int getIndexOfBodyParam(java.lang.reflect.Method method) {
    if (method.isAnnotationPresent(org.springframework.web.bind.annotation.RequestMapping.class)) {
        return org.hildan.livedoc.springmvc.scanner.builder.SpringRequestBodyBuilder.getIndexOfBodyParamForRequestMapping(method);
    }
    if (method.isAnnotationPresent(org.springframework.messaging.handler.annotation.MessageMapping.class)) {
        return org.hildan.livedoc.springmvc.scanner.builder.SpringRequestBodyBuilder.getIndexOfBodyParamForMessageMapping(method);
    }
    return -1;
}