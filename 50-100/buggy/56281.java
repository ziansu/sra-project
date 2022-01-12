private int getBundleArg() {
    int startLI = LineIndex;
    if (evalNumericExpression()) {
        int bundleIndex = EvalNumericExpressionValue.intValue();
        if ((bundleIndex > 0) && (bundleIndex < (com.rfo.basic.Run.theBundles.size()))) {
            return bundleIndex;
        }
        int endLI = LineIndex;
        LineIndex = startLI;
        if ((getNVar()) && ((LineIndex) == endLI)) {
            return createBundle(theValueIndex);
        }
        LineIndex = endLI;
        RunTimeError("Invalid Bundle Pointer");
    }
    return 0;
}