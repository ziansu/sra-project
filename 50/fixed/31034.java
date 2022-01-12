@java.lang.Override
public dyvil.tools.compiler.ast.field.IDataMember resolveField(dyvil.tools.parsing.Name name) {
    final dyvil.tools.compiler.ast.field.IDataMember field = this.pattern.resolveField(name);
    return field != null ? field : null;
}