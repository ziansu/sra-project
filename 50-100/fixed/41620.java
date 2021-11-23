private static edu.wright.cs.jfiles.commands.Commands findCommand(java.lang.String cmdName) {
    edu.wright.cs.jfiles.commands.Commands fcmd = null;
    if ((cmdName.length()) == 2) {
        cmdName = "_" + cmdName;
    }
    for (edu.wright.cs.jfiles.commands.Commands cmd : edu.wright.cs.jfiles.commands.Commands.values()) {
        if (cmd.name().equals(cmdName)) {
            fcmd = cmd;
            break;
        }
    }
    return fcmd;
}