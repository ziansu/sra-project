public void ireturn() {
    Yaka.yvm.ireturn((((nextRank) * 2) + 4));
    if (!(Yaka.expression.checkType(returnType))) {
        java.lang.System.out.println(((((("Error on line " + (Yaka.line)) + " : expecting return type ") + (returnType)) + ", received ") + (Yaka.expression.types.peek())));
    }
    Yaka.expression.finLigne();
}