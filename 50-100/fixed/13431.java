private void optimizeTableScan(java.util.List<org.araqne.logdb.QueryCommand> commands) {
    org.araqne.logdb.query.command.Table table = null;
    boolean found = false;
    for (org.araqne.logdb.QueryCommand c : commands) {
        if (c.getName().equals("table"))
            table = ((org.araqne.logdb.query.command.Table) (c));
        
        if (c.getName().equals("stats")) {
            found = true;
            break;
        }
    }
    if ((table != null) && found)
        table.setParallel(true);
    
}