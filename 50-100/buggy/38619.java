public void processClientCommand(java.lang.String messageCommand, java.lang.String messageBody) {
    switch (messageCommand) {
        case "kill_process" :
            messageBody = messageBody.trim();
            long pid = java.lang.Long.MIN_VALUE;
            try {
                pid = java.lang.Long.parseLong(messageBody);
            } catch (java.lang.NumberFormatException nfe) {
                java.lang.System.err.println("ERROR: not a number pid received with the command for kill_process");
            }
            if (pid > 0) {
                psUtilLib.getProcessKillstatus(pid);
            }
            break;
        default :
            java.lang.System.err.println((("ERROR: Client sent unknown command '" + messageCommand) + "'"));
            break;
    }
}