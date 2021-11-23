private static jcl.LispStruct internalApply(final jcl.functions.Closure currentClosure) {
    return new testground.TestGroundLambdaFunction(currentClosure);
}