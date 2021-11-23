@java.lang.Override
public void resolveTypesGenerate(dyvil.tools.parsing.marker.MarkerList markers, dyvil.tools.compiler.ast.context.IContext context) {
    final dyvil.tools.compiler.ast.classes.ClassBody body = this.theClass.getBody();
    final dyvil.tools.compiler.ast.type.IType classType = this.theClass.getClassType();
    final dyvil.tools.compiler.ast.type.IType arrayType = new dyvil.tools.compiler.ast.type.compound.ArrayType(classType, dyvil.tools.compiler.ast.type.Mutability.IMMUTABLE);
    this.initValuesField(body, arrayType);
    this.initValuesMethod(arrayType);
    this.updateConstructors(classType);
}