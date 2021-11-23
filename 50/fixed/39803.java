void multiply(geogebra.common.kernel.arithmetic.Term t) {
    coefficient = multiply(coefficient, t.coefficient);
    variables.append(t.variables.toString());
    geogebra.common.kernel.arithmetic.Term.sort(variables);
}