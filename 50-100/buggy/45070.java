public void removeActions() {
    java.util.Set<de.citec.sc.dudes.Statement> new_statements = new java.util.HashSet<>();
    for (de.citec.sc.dudes.Statement s : statements) {
        if (!(s.getClass().equals(de.citec.sc.dudes.Action.class))) {
            s.removeActions();
            new_statements.add(s);
        }
    }
    statements = new_statements;
}