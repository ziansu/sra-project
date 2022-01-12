private void removeCommand(java.lang.String[] args) {
    if ((args.length) != 2) {
        _output.println("ERROR: invalid remove command");
    }
    if (!(_monthNames.contains(args[1]))) {
        _output.printf("ERROR: %s is not a loaded month%n", args[1]);
    }
    _budget.removeMonth(_budget.getMonth(args[1]));
    _monthNames.remove(args[1]);
    _output.printf("removed %s from budget%n", args[1]);
}