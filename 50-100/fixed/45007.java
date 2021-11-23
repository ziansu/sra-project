public static vdaoengine.analysis.PQSQPotential getTrimmedLinearPQSQPotential(float[][] x) {
    vdaoengine.analysis.PQSQPotential pqsq = new vdaoengine.analysis.PQSQPotential();
    pqsq.defineIntervals(x);
    pqsq.MajoratingFunction = new vdaoengine.utils.VSimpleFunctions().new vdaoengine.analysis.VAbsFunction();
    pqsq.computeABCoefficients(pqsq.MajoratingFunction, null);
    return pqsq;
}