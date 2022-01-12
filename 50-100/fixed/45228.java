@java.lang.Override
protected void onReceivedMsg(java.lang.String msg) throws java.lang.Exception {
    msg = msg.trim();
    com.leap12.common.Log.debugNewlineChars(msg);
    for (com.leap12.databuddy.Commands.StrCommand<?> cmd : com.leap12.databuddy.aspects.UserDelegate.commands) {
        if (1.0F == (cmd.isCommand(msg))) {
            com.leap12.databuddy.Commands.CmdResponse<?> response = cmd.executeCommand(this, msg);
            writeResponse(response);
            if ((response.getError()) != null) {
                com.leap12.common.Log.e(response.getError());
            }
        }
    }
}