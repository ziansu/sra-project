private dyvil.tools.compiler.ast.expression.IValue resolveField(dyvil.tools.compiler.ast.expression.IValue receiver, dyvil.tools.compiler.ast.context.IContext context) {
    final dyvil.tools.compiler.ast.field.IDataMember field = dyvil.tools.compiler.ast.expression.access.ICall.resolveField(context, receiver, this.name);
    if (field == null) {
        return null;
    }
    if (field.isEnumConstant()) {
        return new dyvil.tools.compiler.ast.expression.constant.EnumValue(this.position, field);
    }
    this.field = field;
    this.receiver = receiver;
    return this;
}