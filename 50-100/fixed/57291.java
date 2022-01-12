public semant.Code visit(semant.Conditional conditional) {
    semant.Code c = new semant.Code();
    ++(controlPoint);
    conditional.controlPoint = controlPoint;
    c.addAll(conditional.b.accept(this));
    semant.Inst inst = new semant.Branch(conditional.s1.accept(this), conditional.s2.accept(this));
    inst.stmControlPoint = controlPoint;
    c.add(inst);
    return c;
}