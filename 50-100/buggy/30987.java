@java.lang.Override
public translate.implementation.TRExp visit(ast.While n) {
    ir.temp.Label lcond = ir.temp.Label.gen();
    ir.temp.Label lbody = ir.temp.Label.gen();
    ir.temp.Label lexit = ir.temp.Label.gen();
    return new translate.implementation.Nx(SEQ(ir.tree.IR.IR.JUMP(lcond), ir.tree.IR.IR.LABEL(lbody), n.body.accept(this).unNx(), ir.tree.IR.IR.LABEL(lcond), n.tst.accept(this).unCx(lexit, lbody), ir.tree.IR.IR.LABEL(lexit)));
}