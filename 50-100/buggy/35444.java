private void typeCheck(nl.uva.bromance.AST.Node n) {
    try {
        n.typeCheck();
    } catch (nl.uva.bromance.typechecking.TypeCheckingException e) {
        e.printStackTrace();
    }
    if (n.hasChildren()) {
        for (nl.uva.bromance.AST.Node child : n.getChildren()) {
            buildReferenceMap(child);
        }
    }
}