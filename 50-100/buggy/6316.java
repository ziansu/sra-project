public semant.Code visit(semant.While whyle) {
    semant.Code c = new semant.Code();
    semant.Inst inst = new semant.Loop(whyle.b.accept(this), whyle.s.accept(this));
    ++(controlPoint);
    whyle.controlPoint = controlPoint;
    inst.stmControlPoint = controlPoint;
    c.add(inst);
    return c;
}