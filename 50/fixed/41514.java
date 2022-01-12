private void buildRoute(java.lang.Class<?> clazz, java.lang.reflect.Method execMethod, java.lang.String path, com.blade.http.HttpMethod method) {
    this.router.route(path, clazz, execMethod, method);
}