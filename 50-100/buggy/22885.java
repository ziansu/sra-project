@java.lang.Override
protected java.lang.Double evaluate(com.fathzer.soft.javaluator.Function function, java.util.Iterator arguments, java.lang.Object evaluationContext) {
    if (function == (abassawo.c4q.nyc.scientificcalculator_build.MainActivity.SQRT)) {
        return java.lang.Math.sqrt(((double) (arguments.next())));
    }else {
        return super.evaluate(function, arguments, evaluationContext);
    }
}