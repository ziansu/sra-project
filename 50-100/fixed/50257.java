@java.lang.Override
public boolean isType(dyvil.tools.compiler.ast.type.IType type) {
    return (dyvil.tools.compiler.ast.type.builtin.Types.isVoid(type)) || (((((this.then) != null) && ((this.elseThen) != null)) && (this.then.isType(type))) && (this.elseThen.isType(type)));
}