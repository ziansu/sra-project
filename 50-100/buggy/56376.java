private java.lang.reflect.Method getFetchMethod(java.lang.String name) {
    java.lang.reflect.Method declaredMethod = null;
    java.lang.reflect.Method method = null;
    try {
        method = httpServlet.getClass().getMethod(name, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class);
    } catch (java.lang.NoSuchMethodException exception) {
    }
    try {
        method = httpServlet.getClass().getDeclaredMethod(name, javax.servlet.http.HttpServletRequest.class, javax.servlet.http.HttpServletResponse.class);
    } catch (java.lang.NoSuchMethodException exception) {
    }
    return method != null ? method : declaredMethod;
}