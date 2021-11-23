@java.lang.Override
@cli.Command
public java.lang.String send(java.lang.String message) throws java.io.IOException {
    if ((authenticated) == false) {
        return executeCommand(new client.SendCommand(message));
    }else {
        return "You have to authenticate before you can send a message";
    }
}