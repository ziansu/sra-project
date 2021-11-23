public static double getInformationCriterion(double sumOfSquaredResiduals, int n, int p) {
    final double logLikelihood = 0.5 * ((-n) * (((java.lang.Math.log((2 * (java.lang.Math.PI)))) + (java.lang.Math.log(sumOfSquaredResiduals))) + 1));
    return gdsc.core.utils.Maths.getInformationCriterionFromLL(logLikelihood, n, p);
}