@java.lang.SuppressWarnings(value = "unchecked")
public com.thebinaryfox.expcalj.ExpressionEnvironment copy() {
    com.thebinaryfox.expcalj.ExpressionEnvironment env = new com.thebinaryfox.expcalj.ExpressionEnvironment();
    env.opt_mulb = opt_mulb;
    env.opt_mulv = opt_mulv;
    env.operations = ((java.util.HashMap<java.lang.String, com.thebinaryfox.expcalj.IOperation>) (operations.clone()));
    env.functions = ((java.util.HashMap<java.lang.String, com.thebinaryfox.expcalj.IFunction>) (functions.clone()));
    env.variables = ((java.util.HashMap<java.lang.String, com.thebinaryfox.expcalj.IVariable>) (variables.clone()));
    return env;
}