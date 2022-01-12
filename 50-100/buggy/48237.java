private parser.AbstractCommand search(java.util.ArrayList<java.lang.String> args) {
    if ((args.size()) == 0) {
        return new parser.DisplayCommand(DisplayCommand.Scope.ALL);
    }
    java.lang.String firstWord = args.get(0).toLowerCase();
    if (parser.Parser.isDate(firstWord)) {
        return new parser.DisplayCommand(java.time.LocalDateTime.parse(getDate(firstWord)));
    }else {
        return new parser.DisplayCommand(getName(args, args.size()));
    }
}