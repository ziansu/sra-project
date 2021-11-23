@java.lang.Override
public boolean isType(dyvil.tools.compiler.ast.type.IType type) {
    if (type == (dyvil.tools.compiler.ast.type.Types.VOID)) {
        return true;
    }
    if (((this.then) != null) && (!(this.then.isType(type)))) {
        return false;
    }
    return !(((this.elseThen) != null) && (!(this.elseThen.isType(type))));
}