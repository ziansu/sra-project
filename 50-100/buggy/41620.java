private static edu.wright.cs.jfiles.commands.Commands findCommand(java.lang.String cmdName) {
    edu.wright.cs.jfiles.commands.Commands fcmd = null;
    if ((cmdName.length()) == 2) {
        cmdName = "_" + cmdName;
    }
    java.lang.System.out.println(("Searching for: " + cmdName));
    for (edu.wright.cs.jfiles.commands.Commands cmd : edu.wright.cs.jfiles.commands.Commands.values()) {
        if (cmd.name().equals(cmdName)) {
            fcmd = cmd;
            break;
        }
    }
    java.lang.System.out.println(("Sended with: " + fcmd));
    return fcmd;
}