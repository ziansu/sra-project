private dyvil.tools.compiler.ast.expression.IValue resolveField(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    dyvil.tools.compiler.ast.field.IDataMember field = dyvil.tools.compiler.ast.access.ICall.resolveField(context, this.receiver, this.name);
    if (field != null) {
        if (field.isEnumConstant()) {
            dyvil.tools.compiler.ast.constant.EnumValue enumValue = new dyvil.tools.compiler.ast.constant.EnumValue(field.getType(), this.name);
            return enumValue;
        }
        this.field = field;
        return this;
    }
    return null;
}