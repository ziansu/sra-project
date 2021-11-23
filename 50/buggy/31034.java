@java.lang.Override
public dyvil.tools.compiler.ast.field.IDataMember resolveField(dyvil.tools.parsing.Name name) {
    dyvil.tools.compiler.ast.field.IDataMember field = this.pattern.resolveField(name);
    if (field != null) {
        return field;
    }
    return null;
}