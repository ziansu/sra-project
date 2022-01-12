public java.util.List<org.logicng.formulas.Literal> negativeLiterals() {
    if (this.fastEvaluable)
        return java.util.Collections.unmodifiableList(((java.util.List<org.logicng.formulas.Literal>) (this.neg)));
    else
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(this.neg));
    
}