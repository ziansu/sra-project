@java.lang.Override
public org.araqne.logdb.QueryCommand parse(org.araqne.logdb.QueryContext context, java.lang.String commandString) {
    int b = commandString.indexOf('[');
    int e = commandString.lastIndexOf(']');
    java.lang.String subQueryString = commandString.substring((b + 1), e).trim();
    java.util.List<org.araqne.logdb.QueryCommand> commands = queryParserService.parseCommands(context, subQueryString);
    return new org.araqne.logdb.query.command.Union(context, commands);
}