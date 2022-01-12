private TypeChecker.AnnoExpr checkExpr(Expr e, TypeChecker.TypeCode t, TypeChecker.Env environment) {
    TypeChecker.AnnoExpr tf = inferExpr(e, environment);
    try {
        if ((tf.typecode_) != t) {
            throw new TypeException((((((PrettyPrinter.print(tf.expr_)) + " has type ") + tf) + " expected ") + t));
        }
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
    return tf;
}