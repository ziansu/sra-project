private net.contextfw.web.application.scope.DefaultWebApplicationStorage.Holder getHolder(net.contextfw.web.application.WebApplicationHandle handle, javax.servlet.http.HttpServletRequest request) {
    net.contextfw.web.application.scope.DefaultWebApplicationStorage.Holder holder;
    synchronized(this) {
        holder = pages.get(handle);
    }
    java.lang.String remoteAddr = getRemoteAddr(request);
    long now = java.lang.System.currentTimeMillis();
    if (((holder != null) && (holder.remoteAddr.equals(remoteAddr))) && ((holder.validThrough) >= now)) {
        return holder;
    }else {
        return null;
    }
}