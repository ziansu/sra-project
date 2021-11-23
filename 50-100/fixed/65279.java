private dyvil.tools.compiler.ast.expression.IValue resolveField(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    dyvil.tools.compiler.ast.field.IDataMember field = dyvil.tools.compiler.ast.access.ICall.resolveField(context, this.receiver, this.name);
    if (field != null) {
        if (field.isEnumConstant()) {
            return new dyvil.tools.compiler.ast.constant.EnumValue(field.getType(), this.name);
        }
        this.field = field;
        return this;
    }
    return null;
}