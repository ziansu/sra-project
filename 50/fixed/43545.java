public static dyvil.tools.parsing.marker.Marker typeError(dyvil.tools.parsing.position.ICodePosition position, dyvil.tools.compiler.ast.type.IType expected, dyvil.tools.compiler.ast.type.IType actual, java.lang.String key, java.lang.Object... args) {
    return dyvil.tools.compiler.transform.TypeChecker.typeError(position, expected, actual, key, "type.expected", "value.type", args);
}