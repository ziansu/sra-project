private Statement createConsStatement() {
    final java.util.List<Command> results = new java.util.ArrayList<Command>();
    results.add(new Command.PushVariable(new Reference(1, 0)));
    results.add(new Command.PushVariable(new Reference(0, 0)));
    results.add(Command.CONS);
    return createFunction(2, results);
}