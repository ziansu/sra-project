private static java.lang.String getStringFromValueEval(org.apache.poi.ss.formula.eval.ValueEval value) throws org.apache.poi.ss.formula.eval.EvaluationException {
    value = org.apache.poi.ss.formula.functions.DStarRunner.solveReference(value);
    if (value instanceof org.apache.poi.ss.formula.eval.BlankEval)
        return "";
    
    if (!(value instanceof org.apache.poi.ss.formula.eval.StringValueEval))
        throw new org.apache.poi.ss.formula.eval.EvaluationException(org.apache.poi.ss.formula.eval.ErrorEval.VALUE_INVALID);
    
    return ((org.apache.poi.ss.formula.eval.StringValueEval) (value)).getStringValue();
}