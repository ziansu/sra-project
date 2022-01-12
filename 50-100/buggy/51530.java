public static double getInformationCriterion(double sumOfSquaredResiduals, int n, int p) {
    final double logLikelihood = 0.5 * ((-n) * ((((java.lang.Math.log((2 * (java.lang.Math.PI)))) + 1) - (java.lang.Math.log(n))) + (java.lang.Math.log(sumOfSquaredResiduals))));
    return gdsc.core.utils.Maths.getInformationCriterionFromLL(logLikelihood, n, p);
}