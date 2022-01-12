@java.lang.Override
protected java.lang.Double evaluate(com.fathzer.soft.javaluator.Operator operator, java.util.Iterator<java.lang.Double> operands, java.lang.Object evaluationContext) {
    if (operator == (abassawo.c4q.nyc.scientificcalculator_build.MainActivity.factorial)) {
        double num = operands.next();
        double facResult = 1;
        for (double i = num; i >= 1; i--) {
            facResult = facResult * i;
        }
        return facResult;
    }else {
        return super.evaluate(operator, operands, evaluationContext);
    }
}