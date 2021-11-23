@java.lang.Override
public void stop() {
    com.youthlin.chatroom.server.Server.LOG.trace("程序关闭");
    if ((controller) instanceof com.youthlin.chatroom.server.control.ServerController)
        ((com.youthlin.chatroom.server.control.ServerController) (controller)).exit();
    
    java.lang.System.exit(0);
}