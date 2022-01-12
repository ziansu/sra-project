@java.lang.Override
public java.lang.Object visit(IC.AST.LocalVariable localVariable) {
    java.lang.String localVariableStr = "";
    if (localVariable.hasInitValue()) {
        target = freshRegister();
        localVariable.getEnclosingScope().setVaraibleReg(localVariable.getName(), c);
        localVariableStr = localVariableStr.concat(((java.lang.String) (localVariable.getInitValue().accept(this))));
        localVariableStr = localVariableStr.concat(Emit(localVariable.getName(), target));
        return localVariableStr;
    }
    return localVariable.getName();
}