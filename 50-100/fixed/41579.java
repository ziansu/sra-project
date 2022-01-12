@java.lang.Override
public void initialize(net.contextfw.web.application.WebApplication application, javax.servlet.http.HttpServletRequest request, long validThrough, net.contextfw.web.application.scope.ScopedWebApplicationExecution execution) {
    net.contextfw.web.application.WebApplicationHandle handle = createHandle();
    application.setHandle(handle);
    net.contextfw.web.application.scope.DefaultWebApplicationStorage.Holder holder = new net.contextfw.web.application.scope.DefaultWebApplicationStorage.Holder(application, getRemoteAddr(request), validThrough);
    synchronized(this) {
        pages.put(handle, holder);
    }
    synchronized(holder) {
        execution.execute(holder.application);
    }
}