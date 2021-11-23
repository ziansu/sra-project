private static java.lang.StringBuilder run(java.io.BufferedReader br) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.StringBuilder msg = new java.lang.StringBuilder();
    while ((events.commands.LinuxCommand.line = br.readLine()) != null) {
        msg.append(events.commands.LinuxCommand.line);
        msg.append("\n");
    } 
    events.commands.LinuxCommand.process.waitFor();
    msg.append("exit: ").append(events.commands.LinuxCommand.process.exitValue());
    events.commands.LinuxCommand.process.destroy();
    return msg;
}