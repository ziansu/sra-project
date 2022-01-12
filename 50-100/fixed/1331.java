@java.lang.Override
public void execute(net.contextfw.web.application.WebApplicationHandle handle, net.contextfw.web.application.scope.ScopedWebApplicationExecution execution) {
    net.contextfw.web.application.scope.DefaultWebApplicationStorage.Holder holder;
    synchronized(this) {
        holder = pages.get(handle);
    }
    if (holder != null) {
        synchronized(holder) {
            execution.execute(holder.application);
        }
    }else {
        execution.execute(null);
    }
}