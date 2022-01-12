@java.lang.Override
public com.sun.codemodel.JExpression testNaExpr(com.sun.codemodel.JCodeModel codeModel, com.sun.codemodel.JVar scalarVariable) {
    return codeModel.ref(org.renjin.sexp.ComplexVector.class).staticInvoke("isNaN").arg(scalarVariable);
}