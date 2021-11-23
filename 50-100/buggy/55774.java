@java.lang.Override
public void checkType(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context, dyvil.tools.compiler.ast.type.TypePosition position) {
    if (position == (TypePosition.CLASS)) {
        markers.add(dyvil.tools.compiler.util.MarkerMessages.createMarker(this.returnType.getPosition(), "type.class.lambda"));
    }
    for (int i = 0; i < (this.parameterCount); i++) {
        this.parameterTypes[i].checkType(markers, context, TypePosition.PARAMETER_TYPE);
    }
    this.returnType.checkType(markers, context, TypePosition.RETURN_TYPE);
}