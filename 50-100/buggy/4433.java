private void readImplicitParameters(java.lang.reflect.Method method, io.swagger.models.Operation operation) {
    io.swagger.annotations.ApiImplicitParams implicitParams = method.getAnnotation(io.swagger.annotations.ApiImplicitParams.class);
    if ((implicitParams != null) && ((implicitParams.value().length) > 0)) {
        for (io.swagger.annotations.ApiImplicitParam param : implicitParams.value()) {
            io.swagger.models.parameters.Parameter p = readImplicitParam(param, method.getDeclaringClass());
            if (p != null) {
                operation.addParameter(p);
            }
        }
    }
}