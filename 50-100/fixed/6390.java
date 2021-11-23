@java.lang.Override
public java.lang.Object visit(IC.AST.VirtualMethod method) {
    java.lang.String methodStr = "";
    for (IC.AST.Formal f : method.getFormals()) {
        f.accept(this);
    }
    for (IC.AST.Statement st : method.getStatements()) {
        methodStr = methodStr.concat(((java.lang.String) (st.accept(this))));
    }
    return methodStr;
}