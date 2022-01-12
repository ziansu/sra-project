public org.apache.poi.ss.formula.eval.ValueEval evaluate(int srcRowIndex, int srcColumnIndex, org.apache.poi.ss.formula.eval.ValueEval arg0, org.apache.poi.ss.formula.eval.ValueEval arg1) {
    try {
        double d0 = org.apache.poi.ss.formula.functions.NumericFunction.singleOperandEvaluate(arg0, srcRowIndex, srcColumnIndex);
        double d1 = org.apache.poi.ss.formula.functions.NumericFunction.singleOperandEvaluate(arg1, srcRowIndex, srcColumnIndex);
        return new org.apache.poi.ss.formula.eval.NumberEval(org.apache.poi.ss.formula.functions.Days360.evaluate(d0, d1, false));
    } catch (org.apache.poi.ss.formula.eval.EvaluationException e) {
        return e.getErrorEval();
    }
}