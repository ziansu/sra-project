public static void registerLambdaExpression(com.blazingkin.interpreter.executor.lambda.LambdaExpression le, java.lang.String expName) {
    com.blazingkin.interpreter.executor.lambda.LambdaRegistrar.runtimeDefinedLambdaExpressions.put(expName, le);
}