protected java.util.ArrayList<pbs.parser.Statement> stmtList() {
    java.util.ArrayList<pbs.parser.Statement> stmtlist = new java.util.ArrayList<pbs.parser.Statement>();
    pbs.parser.Statement s = nextStatement();
    while (s != null) {
        stmtlist.add(s);
        s = nextStatement();
    } 
    return stmtlist;
}