private TypeChecker.AnnoExpr checkExpr(Expr e, TypeChecker.TypeCode t, TypeChecker.Env environment) {
    TypeChecker.AnnoExpr tf = inferExpr(e, environment);
    if ((tf.typecode_) != t) {
        throw new TypeException((((((PrettyPrinter.print(tf.expr_)) + " has type ") + tf) + " expected ") + t));
    }
    return tf;
}