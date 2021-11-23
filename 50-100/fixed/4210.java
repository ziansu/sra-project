public static vdaoengine.analysis.PQSQPotential getTrimmedXsquaredPlusXPQSQPotential(float[][] x) {
    vdaoengine.analysis.PQSQPotential pqsq = new vdaoengine.analysis.PQSQPotential();
    pqsq.defineIntervals(x);
    pqsq.MajoratingFunction = new vdaoengine.utils.VSimpleFunctions().new vdaoengine.analysis.VPolynomialFunction();
    float[] pars = new float[]{ 0 , 1 , 1 };
    pqsq.functionParameters = pars;
    pqsq.computeABCoefficients(pqsq.MajoratingFunction, pars);
    return pqsq;
}