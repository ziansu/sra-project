public <T> void visitCtLiteral(spoon.reflect.code.CtLiteral<T> literal) {
    if ((literal.getValue()) != null)
        write(literal.getValue().toString());
    else
        write("null");
    
}