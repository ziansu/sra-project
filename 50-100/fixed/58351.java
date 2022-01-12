public static boolean isLambdaExpression(java.lang.String lam) {
    java.lang.String[] splits = com.blazingkin.interpreter.executor.Executor.parseExpressions(lam);
    java.lang.String name = splits[0].toUpperCase();
    for (com.blazingkin.interpreter.executor.instruction.Instruction in : com.blazingkin.interpreter.executor.instruction.Instruction.values()) {
        if ((in.instruction.equals(name)) && ((in.executor) instanceof com.blazingkin.interpreter.executor.lambda.LambdaFunction)) {
            return true;
        }
    }
    return com.blazingkin.interpreter.executor.lambda.LambdaRegistrar.isRegisteredLambdaExpression(name);
}