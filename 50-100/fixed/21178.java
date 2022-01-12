@java.lang.Override
public java.lang.String getPath(io.swagger.servlet.ReaderContext context, java.lang.reflect.Method method) {
    final io.swagger.annotations.Api apiAnnotation = context.getCls().getAnnotation(io.swagger.annotations.Api.class);
    final io.swagger.annotations.ApiOperation apiOperation = io.swagger.util.ReflectionUtils.getAnnotation(method, io.swagger.annotations.ApiOperation.class);
    final java.lang.String operationPath = (apiOperation == null) ? null : apiOperation.nickname();
    return io.swagger.util.PathUtils.collectPath(context.getParentPath(), (apiAnnotation == null ? null : apiAnnotation.value()), method.getName());
}