public static dyvil.tools.compiler.ast.expression.IValue constant(dyvil.tools.compiler.ast.expression.IValue value, dyvil.tools.compiler.lexer.marker.MarkerList markers) {
    int depth = dyvil.tools.compiler.DyvilCompiler.maxConstantDepth;
    while (!(value.isConstant())) {
        if ((--depth) < 0) {
            markers.add(value.getPosition(), "value.constant", DyvilCompiler.maxConstantDepth);
            return value.getType().getDefaultValue();
        }
        value = value.foldConstants();
    } 
    return value;
}