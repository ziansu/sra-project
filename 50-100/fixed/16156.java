@java.lang.Override
public com.knpl.simplecalculator.numbers.Complex visit(com.knpl.simplecalculator.visitors.Var node, java.lang.Void info) throws java.lang.Exception {
    com.knpl.simplecalculator.numbers.Complex result = map.get(node.getName());
    if (result == null)
        throw new java.lang.Exception(("No mapping for variable " + (node.getName())));
    
    return new com.knpl.simplecalculator.numbers.Complex(result);
}