protected void checkSuccessorMax(java.util.Collection<org.openrdf.model.Statement> stmts, org.openrdf.model.URI property) {
    if ((stmts.size()) > 1) {
        throw new cz.cvut.kbss.ontodriver.exception.IntegrityConstraintViolatedException(((("Invalid number of values found for assertion " + property) + ". Expected 1, got ") + (stmts.size())));
    }
}