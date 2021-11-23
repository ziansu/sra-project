public static int Expression() {
    c_a.parser.parser.operationsArray.clear();
    (c_a.parser.parser.ExpressionCounter)++;
    c_a.parser.parser.parserWriter.println("rule #73: expanding");
    c_a.parser.parser.Simple_Expression();
    c_a.parser.parser.parserWriter.println("rule #73: expanding");
    c_a.parser.parser.Opt_Relational_Part();
    for (int i = (c_a.parser.parser.operationsArray.size()) - 1; i >= 0; i--) {
        c_a.semantics.assembly_builder.assemblyWriter.println(c_a.parser.parser.operationsArray.get(i));
        c_a.parser.parser.operationsArray.remove(i);
    }
    int returnExpressionCounter = c_a.parser.parser.ExpressionCounter;
    return returnExpressionCounter;
}