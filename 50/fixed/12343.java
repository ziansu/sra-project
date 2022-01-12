@java.lang.Override
public java.lang.String getInternalName() {
    if (((this.variance) == (dyvil.tools.compiler.ast.generic.Variance.CONTRAVARIANT)) || ((this.bound) == null)) {
        return "java/lang/Object";
    }
    return this.bound.getInternalName();
}