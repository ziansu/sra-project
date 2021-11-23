@java.lang.Override
public boolean isExhaustive() {
    if (dyvilx.tools.compiler.ast.type.compound.NullableType.isNullable(this.unapplyCall.getType())) {
        return false;
    }
    for (int i = 0; i < (this.patternCount); i++) {
        if (!(this.patterns[i].isExhaustive())) {
            return false;
        }
    }
    return true;
}