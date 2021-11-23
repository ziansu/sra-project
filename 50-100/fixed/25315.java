@java.lang.Override
public org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.ASTMatcher visit(org.sosy_lab.cpachecker.cfa.ast.c.CIdExpression exp) throws org.sosy_lab.cpachecker.cpa.automaton.InvalidAutomatonException {
    java.lang.String name = exp.getName();
    if (name.startsWith(org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.JOKER_EXPR)) {
        return org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.JokerMatcher.INSTANCE;
    }else
        if (name.startsWith(org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.NUMBERED_JOKER_EXPR)) {
            java.lang.String s = name.substring(org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.NUMBERED_JOKER_EXPR.length());
            int i = java.lang.Integer.parseInt(s);
            return new org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.NumberedJokerMatcher(i);
        }else {
            return new org.sosy_lab.cpachecker.cpa.automaton.AutomatonASTComparator.CIdExpressionMatcher(exp);
        }
    
}