private shared.command.AbstractCommand save(java.util.ArrayList<java.lang.String> args) {
    if ((args.size()) == 0) {
        return invalidCommand();
    }
    return new shared.command.SaveCommand(args.get(0));
}