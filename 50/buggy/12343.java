@java.lang.Override
public java.lang.String getInternalName() {
    if ((this.variance) == (dyvil.tools.compiler.ast.generic.Variance.CONTRAVARIANT)) {
        return "java/lang/Object";
    }
    return this.bound.getInternalName();
}