public lir.LirReturnInfo visit(lir.ClassMethod classMethod, lir.Environment d) {
    methodVisitor(classMethod, d);
    return null;
}