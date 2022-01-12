@java.lang.Override
public dyvil.tools.compiler.ast.field.IDataMember resolveField(dyvil.tools.parsing.Name name) {
    if ((this.variables) != null) {
        for (int i = (this.variables.size()) - 1; i >= 0; i--) {
            final dyvil.tools.compiler.ast.field.IVariable variable = this.variables.get(i);
            if ((variable.getName()) == name) {
                return variable;
            }
        }
    }
    return null;
}