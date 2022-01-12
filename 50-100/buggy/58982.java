@java.lang.Override
public java.lang.Void visitNumConst(de.fhg.iais.roberta.syntax.expr.NumConst<java.lang.Void> numConst) {
    if (de.fhg.iais.roberta.syntax.codegen.PythonCodeGeneratorVisitor.isInteger(numConst.getValue())) {
        this.sb.append(numConst.getValue());
    }else {
        this.sb.append("float(");
        this.sb.append(numConst.getValue());
        this.sb.append(")");
    }
    return null;
}