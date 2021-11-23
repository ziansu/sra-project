@java.lang.Override
protected void service(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.Thread currentThread = java.lang.Thread.currentThread();
    java.lang.ClassLoader oldContextClassLoader = currentThread.getContextClassLoader();
    currentThread.setContextClassLoader(this.getClass().getClassLoader());
    super.service(req, resp);
    currentThread.setContextClassLoader(oldContextClassLoader);
}