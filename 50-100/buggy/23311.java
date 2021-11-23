public org.apache.poi.ss.formula.eval.ValueEval evaluate(int srcRowIndex, int srcColumnIndex, org.apache.poi.ss.formula.eval.ValueEval arg0, org.apache.poi.ss.formula.eval.ValueEval arg1) {
    double result;
    try {
        double d0 = org.apache.poi.ss.formula.functions.NumericFunction.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);
        double d1 = org.apache.poi.ss.formula.functions.NumericFunction.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);
        result = org.apache.poi.ss.formula.functions.Days360.evaluate(d0, d1, false);
    } catch (org.apache.poi.ss.formula.eval.EvaluationException e) {
        return e.getErrorEval();
    }
    return new org.apache.poi.ss.formula.eval.NumberEval(result);
}