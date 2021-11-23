@java.lang.Override
public void invoke(java.util.Scanner args) {
    final codeu.chat.common.ServerInfo info = context.getInfo();
    if (info == null) {
        java.lang.System.out.println("ERROR: The server did not send a valid info object.");
    }else {
        java.lang.System.out.println(info);
    }
}