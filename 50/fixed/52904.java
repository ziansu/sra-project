protected net.contextfw.web.application.WebApplicationHandle createHandle() {
    net.contextfw.web.application.WebApplicationHandle handle;
    handle = new net.contextfw.web.application.WebApplicationHandle(java.util.UUID.randomUUID().toString());
    return handle;
}