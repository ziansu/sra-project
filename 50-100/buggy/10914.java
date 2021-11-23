public static com.blazingkin.interpreter.executor.lambda.LambdaExpression getLambdaExpression(java.lang.String name, java.lang.String[] args) {
    if ((name.contains("(")) && (name.contains(")"))) {
        com.blazingkin.interpreter.executor.lambda.LambdaExpression le = com.blazingkin.interpreter.executor.lambda.LambdaParser.parseLambdaExpression(name);
        return ((com.blazingkin.interpreter.executor.lambda.LambdaExpression) (le.getValue().value)).cloneWithArgs(args);
    }
    return com.blazingkin.interpreter.executor.lambda.LambdaRegistrar.runtimeDefinedLambdaExpressions.get(name).cloneWithArgs(args);
}