private shared.command.AbstractCommand save(java.util.ArrayList<java.lang.String> args) {
    if ((args.size()) != 1) {
        return invalidCommand();
    }
    return new shared.command.SaveCommand(args.get(0));
}