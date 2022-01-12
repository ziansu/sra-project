@java.lang.Override
public com.shadowmydx.sql.interpreter.parser.MatchNode execute(com.shadowmydx.sql.interpreter.parser.MatchNode root, com.shadowmydx.sql.interpreter.environment.SQLEnvironment env, java.util.List<java.lang.Object> childrenResult) {
    com.shadowmydx.sql.interpreter.parser.MatchNode start = root;
    com.shadowmydx.sql.interpreter.parser.MatchNode ifChange = root;
    while (start != null) {
        if ((start.getType()) == (com.shadowmydx.sql.interpreter.parser.NodeType.START)) {
            ifChange = com.shadowmydx.sql.interpreter.environment.executor.MainExecutor.helpHandler(start, env);
        }
        if (ifChange != start) {
            start = ifChange;
        }
        start = start.getNextNode();
    } 
    return root;
}