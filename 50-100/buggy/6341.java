@java.lang.Override
public void visitParameter(java.lang.String name, int modifiers) {
    final dyvil.tools.compiler.ast.parameter.IParameter parameter = this.method.getExternalParameterList().get(this.parameterIndex);
    if (parameter == null) {
        return ;
    }
    (this.parameterIndex)++;
    final dyvil.tools.parsing.Name name1 = dyvil.tools.parsing.Name.fromQualified(name);
    parameter.setName(name1);
    parameter.setLabel(name1);
    if (modifiers != 0) {
        parameter.getModifiers().addIntModifier(modifiers);
    }
}