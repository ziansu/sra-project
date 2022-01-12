private boolean visitLetClause(com.jetbrains.jetpad.vclang.term.expr.visitor.LetClause clause) {
    try (com.jetbrains.jetpad.vclang.term.expr.visitor.TerminationCheckVisitor.PatternLifter lifter1 = new com.jetbrains.jetpad.vclang.term.expr.visitor.TerminationCheckVisitor.PatternLifter()) {
        if (!(visitArguments(clause.getArguments(), lifter1))) {
            return false;
        }
    }
    return clause.getTerm().accept(this);
}