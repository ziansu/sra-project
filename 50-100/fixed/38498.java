@java.lang.Override
public boolean needsSignature() {
    for (int i = 0; i < (this.parameterCount); i++) {
        final dyvil.tools.compiler.ast.type.IType parameterType = this.parameters[i].getType();
        if ((parameterType.isGenericType()) || (parameterType.hasTypeVariables())) {
            return true;
        }
    }
    return false;
}