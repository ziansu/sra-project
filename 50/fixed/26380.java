@java.lang.Override
public double eval(java.util.Map<java.lang.String, java.lang.Double> varValues) {
    double result = 1;
    for (mathnstuff.symbolic.Expression term : terms) {
        result *= term.eval(varValues);
    }
    return result;
}