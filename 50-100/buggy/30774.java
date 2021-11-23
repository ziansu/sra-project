@java.lang.Override
public org.araqne.logdb.QueryCommand parse(org.araqne.logdb.QueryContext context, java.lang.String commandString) {
    int b = commandString.indexOf('[');
    int e = commandString.lastIndexOf(']');
    org.araqne.logdb.QueryContext subQueryContext = new org.araqne.logdb.QueryContext(context.getSession(), context);
    java.lang.String subQueryString = commandString.substring((b + 1), e).trim();
    java.util.List<org.araqne.logdb.QueryCommand> commands = queryParserService.parseCommands(subQueryContext, subQueryString);
    return new org.araqne.logdb.query.command.Union(context, commands);
}