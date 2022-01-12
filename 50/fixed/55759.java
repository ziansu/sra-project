@java.lang.Override
public void stop() {
    if ((controller) instanceof com.youthlin.chatroom.server.control.ServerController) {
        ((com.youthlin.chatroom.server.control.ServerController) (controller)).exit();
    }
}