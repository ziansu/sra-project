private void generate(wyc.builder.Assign s, wyc.builder.CodeGenerator.EnclosingScope scope) {
    int[] lhs = generate(((java.util.List) (s.lvals)), scope);
    int[] rhs = generate(s.rvals, scope);
    scope.add(new wyc.builder.Bytecode.Assign(lhs, rhs), s.attributes());
}