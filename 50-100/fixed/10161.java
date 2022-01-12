@java.lang.Override
public java.lang.Object visit(IC.AST.LocalVariable localVariable) {
    java.lang.String localVariableStr = "";
    if (localVariable.hasInitValue()) {
        target = freshRegister();
        localVariableStr = localVariableStr.concat(((java.lang.String) (localVariable.getInitValue().accept(this))));
        localVariableStr = localVariableStr.concat(Emit(localVariable.getName(), target));
        localVariable.getEnclosingScope().setVaraibleReg(localVariable.getName(), c);
        return localVariableStr;
    }
    return localVariable.getName();
}