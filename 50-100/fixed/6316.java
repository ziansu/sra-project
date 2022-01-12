public semant.Code visit(semant.While whyle) {
    semant.Code c = new semant.Code();
    ++(controlPoint);
    semant.Inst inst = new semant.Loop(whyle.b.accept(this), whyle.s.accept(this));
    whyle.controlPoint = controlPoint;
    inst.stmControlPoint = controlPoint;
    c.add(inst);
    return c;
}