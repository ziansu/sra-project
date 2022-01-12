private static int executeOperation(java.lang.String o, Stack stack, java.lang.Boolean e) {
    Operation savedOp = null;
    java.lang.Boolean g = false;
    for (Operation ops : Calculator.operationList) {
        if (ops.getOperation().equals(o)) {
            g = true;
            savedOp = ops;
            break;
        }
    }
    if (g) {
        for (java.lang.String a : savedOp.getOpExe()) {
            e = Calculator.calculate(stack, a, e);
        }
    }
    return e;
}