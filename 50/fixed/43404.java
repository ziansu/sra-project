@java.lang.Override
public org.apache.catalina.websocket.StreamInbound createWebSocketInbound(java.lang.String subProtocol, javax.servlet.http.HttpServletRequest request) {
    com.zoe.weiya.controller.echo.EchoServlet.log.info("EchoServlet");
    javax.servlet.ServletContext application = this.getServletContext();
    return new com.zoe.weiya.controller.echo.MyMessageInbound(application);
}