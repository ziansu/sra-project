public ar.fiuba.tdd.tp.server.utils.Command readCommand() {
    java.lang.String input = readString();
    for (java.lang.String command : ar.fiuba.tdd.tp.server.io.ServerInput.commands.keySet()) {
        if (input.startsWith(command)) {
            this.inputTrail = input.replace((command + " "), "").trim();
            return ar.fiuba.tdd.tp.server.io.ServerInput.commands.get(command);
        }
    }
    return ar.fiuba.tdd.tp.server.utils.Command.NONE;
}