@java.lang.Override
public void handle(org.eclipse.jetty.server.Request baseRequest, javax.servlet.ServletRequest request, javax.servlet.ServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    final boolean asyncSupported = baseRequest.isAsyncSupported();
    if (!(isAsyncSupported())) {
        baseRequest.setAsyncSupported(false, null);
    }
    try {
        servlet.service(request, response);
    } finally {
        baseRequest.setAsyncSupported(asyncSupported, null);
    }
}