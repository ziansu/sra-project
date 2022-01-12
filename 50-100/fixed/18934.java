private static java.lang.Boolean executeOperation(java.lang.String o, Stack stack) {
    Operation savedOp = null;
    java.lang.Boolean g = false;
    for (Operation ops : Calculator.operationList) {
        if (ops.getOperation().equals(o)) {
            g = true;
            savedOp = ops;
            break;
        }
    }
    for (java.lang.String a : savedOp.getOpExe()) {
        if (g) {
            g = Calculator.calculate(stack, a, g);
        }else {
            return false;
        }
    }
    return true;
}