protected net.contextfw.web.application.WebApplicationHandle createHandle() {
    net.contextfw.web.application.WebApplicationHandle handle;
    do {
        handle = new net.contextfw.web.application.WebApplicationHandle(java.util.UUID.randomUUID().toString());
    } while (pages.containsKey(handle) );
    return handle;
}