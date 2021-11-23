@java.lang.Override
@cli.Command
public java.lang.String lastMsg() throws java.io.IOException {
    return tcpServerListenerThread.getLastMsg();
}