private static co.sepulveda.pongee.servlet.resources.ResourceEntity buildResource(co.sepulveda.pongee.servlet.http.HttpMethod httpMethod, java.lang.String absolutePath, java.lang.Object controller, java.lang.reflect.Method method) {
    co.sepulveda.pongee.servlet.resources.ResourceEntity resource = new co.sepulveda.pongee.servlet.resources.ResourceEntity(absolutePath);
    co.sepulveda.pongee.servlet.resources.MethodInfo methodInfo = new co.sepulveda.pongee.servlet.resources.MethodInfo(controller, method);
    resource.addMethod(httpMethod, methodInfo);
    return resource;
}