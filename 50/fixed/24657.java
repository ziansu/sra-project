public <T> void visitCtLiteral(spoon.reflect.code.CtLiteral<T> literal) {
    if ((literal.getValue()) != null)
        write(literal.toString());
    else
        write("null");
    
}