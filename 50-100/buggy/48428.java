@java.lang.Override
public dyvil.tools.compiler.ast.expression.IValue convertValueTo(dyvil.tools.compiler.ast.expression.IValue value, dyvil.tools.compiler.ast.type.IType targetType, dyvil.tools.compiler.ast.generic.ITypeContext typeContext, dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    if (!(this.isConvertibleTo(targetType))) {
        return null;
    }
    final dyvil.tools.compiler.ast.expression.LiteralConversion conversion = new dyvil.tools.compiler.ast.expression.LiteralConversion(value, dyvil.tools.compiler.ast.type.compound.ImplicitNullableType.LazyTypes.UNWRAP);
    conversion.setType(targetType);
    return conversion;
}