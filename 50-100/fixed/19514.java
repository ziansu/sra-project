@java.lang.Override
public dyvil.tools.compiler.ast.type.IType getType() {
    if ((this.commonType) != null) {
        return this.commonType;
    }
    if (((this.then) != null) && ((this.elseThen) != null)) {
        return this.commonType = dyvil.tools.compiler.ast.type.builtin.Types.combine(this.then.getType(), this.elseThen.getType());
    }
    return this.commonType = dyvil.tools.compiler.ast.type.builtin.Types.VOID;
}