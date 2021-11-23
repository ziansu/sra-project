private void generate(wyc.builder.Assign s, wyc.builder.CodeGenerator.EnclosingScope scope) {
    int lhs = generate(s.lvals.get(0), scope);
    int rhs = generate(s.rvals.get(0), scope);
    scope.add(new wyc.builder.Bytecode.Assign(lhs, rhs), s.attributes());
}