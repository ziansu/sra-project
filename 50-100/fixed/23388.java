private void generate(wyc.builder.VariableDeclaration s, wyc.builder.CodeGenerator.Environment environment, wyil.util.AttributedCodeBlock codes, wyc.lang.WhileyFile.Context context) {
    int root = environment.get(s.parameter.name);
    if ((s.expr) != null) {
        int operand = generate(s.expr, environment, codes, context);
        codes.add(wyc.builder.Codes.Assign(s.expr.result().raw(), root, operand), wyc.builder.CodeGenerator.attributes(s));
    }
}