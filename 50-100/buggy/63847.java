@java.lang.Override
public dyvil.tools.compiler.ast.expression.IValue withType(dyvil.tools.compiler.ast.type.IType type, dyvil.tools.compiler.ast.generic.ITypeContext typeContext, dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    final dyvil.tools.compiler.ast.field.IDataMember field = type.resolveField(this.name);
    if (field == null) {
        markers.add(dyvil.tools.compiler.util.Markers.semanticError(this.position, "resolve.field", this.name));
        return null;
    }
    this.field = field;
    return super.withType(type, typeContext, markers, context);
}